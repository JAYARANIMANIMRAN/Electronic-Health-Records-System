package com.example.EHRS.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MedicalRecords{
    @Id
    @GeneratedValue
    private Long id;

    private String diagnosis;
    private String notes;
    private Date visitDate;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonBackReference
    private Patients patient;
}
