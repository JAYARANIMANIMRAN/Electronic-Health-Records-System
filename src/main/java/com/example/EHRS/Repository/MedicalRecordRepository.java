package com.example.EHRS.Repository;

import com.example.EHRS.Models.MedicalRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecords, Long> {

//    MedicalRecords save(MedicalRecords record);
}
