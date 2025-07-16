package com.example.EHRS.Services;
import com.example.EHRS.Models.Patients;
import com.example.EHRS.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public class PatientService {


        @Autowired
        private PatientRepository patientRepo;

        public List<Patients> getAllPatients() {
            return patientRepo.findAll();
        }

        public Optional<Patients> getPatientById(Long id) {
            return patientRepo.findById(id);
        }

        public Patients addPatient(Patients patient) {
            return patientRepo.save(patient);
        }

        public Patients updatePatient(Long id, Patients updatedPatient) {
            updatedPatient.setId(id);
            return patientRepo.save(updatedPatient);
        }

        public void deletePatient(Long id) {
            patientRepo.deleteById(id);
        }


}
