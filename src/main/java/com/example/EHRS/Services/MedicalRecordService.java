package com.example.EHRS.Services;



import com.example.EHRS.Models.MedicalRecords;
import com.example.EHRS.Models.Patients;
import com.example.EHRS.Repository.MedicalRecordRepository;
import com.example.EHRS.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class MedicalRecordService {

        @Autowired
        private MedicalRecordRepository medicalRecordRepo;

        @Autowired
        private PatientRepository patientRepo;

        public MedicalRecords addRecord(Long patientId, MedicalRecords record) {
            Patients patient = patientRepo.findById(patientId).orElse(null);
            if (patient == null) {
                return null;
            }

            record.setPatient(patient);
//            record.setVisitDate(LocalDateTime.now());
            return medicalRecordRepo.save(record);
        }



}
