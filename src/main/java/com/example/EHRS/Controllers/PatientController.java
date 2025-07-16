package com.example.EHRS.Controllers;

import com.example.EHRS.Models.Patients;
import com.example.EHRS.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "*")

public class PatientController {

        @Autowired
        private PatientRepository patientRepository;

        @GetMapping
        public List<Patients> getAllPatients() {
            return patientRepository.findAll();
        }

        @GetMapping("/{id}")
        public Patients getPatientById(@PathVariable Long id) {
            return patientRepository.findById(id).orElse(null);
        }

        @PostMapping
        public Patients addPatient(@RequestBody Patients patient) {
            return patientRepository.save(patient);
        }

        @PutMapping("/{id}")
        public Patients updatePatient(@PathVariable Long id, @RequestBody Patients patient) {
            patient.setId(id);
            return patientRepository.save(patient);
        }

        @DeleteMapping("/{id}")
        public void deletePatient(@PathVariable Long id) {
            patientRepository.deleteById(id);
        }


}
