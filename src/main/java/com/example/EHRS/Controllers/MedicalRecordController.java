package com.example.EHRS.Controllers;

import com.example.EHRS.Models.MedicalRecords;
import com.example.EHRS.Models.Patients;
import com.example.EHRS.Repository.MedicalRecordRepository;
import com.example.EHRS.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;



@RestController
@RequestMapping("/api/records")
@CrossOrigin(origins = "*")
public class MedicalRecordController {

        @Autowired
        private MedicalRecordRepository recordRepository;

        @Autowired
        private PatientRepository patientRepository;

        @PostMapping("/{patientId}")
        public MedicalRecords addRecord(@PathVariable Long patientId, @RequestBody MedicalRecords record) {
            Patients patient = patientRepository.findById(patientId).orElse(null);
            if (patient == null) return null;

            record.setPatient(patient);
//            record.setVisitDate(Date.now());
            return recordRepository.save(record);
        }


}
