package com.example.EHRS.Models;

import com.example.EHRS.Models.Patient;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private User doctor;
}
