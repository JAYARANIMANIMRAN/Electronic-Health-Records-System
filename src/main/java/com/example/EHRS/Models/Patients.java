package com.example.EHRS.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patients {
        @Id
        @GeneratedValue
        private Long id;

        private String name;
        private String gender;
        private Date dob;
        private String contact;
        private String address;
        private String email;

}


