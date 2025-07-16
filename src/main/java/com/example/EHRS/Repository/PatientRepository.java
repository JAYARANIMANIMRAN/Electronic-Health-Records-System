package com.example.EHRS.Repository;

import com.example.EHRS.Models.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patients, Long> {
    List<Patients> findAll();

    Optional<Patients> findById(Long id);

    Patients save(Patients patient);

    void deleteById(Long id);
}
