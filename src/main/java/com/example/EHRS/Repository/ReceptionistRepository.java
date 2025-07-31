package com.example.EHRS.Repository;

import com.example.EHRS.Models.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {
    Receptionist findByEmail(String email);
}
