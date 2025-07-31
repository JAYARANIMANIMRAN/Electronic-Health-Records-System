package com.example.EHRS.Repository;

import com.example.EHRS.Models.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patients, Long> {
    Patients findByEmail(String email);
}
