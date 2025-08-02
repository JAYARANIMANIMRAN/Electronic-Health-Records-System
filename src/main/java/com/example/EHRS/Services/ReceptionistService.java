package com.example.EHRS.Services;

import com.example.EHRS.Models.Appointment;
import com.example.EHRS.Models.MedicalRecord;
import com.example.EHRS.Models.Patient;
import com.example.EHRS.Repository.AppointmentRepository;
import com.example.EHRS.Repository.MedicalRecordRepository;
import com.example.EHRS.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionistService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    // Add patient
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Get patient by ID
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with ID: " + id));
    }

    // Add appointment
    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Add medical record
    public MedicalRecord addMedicalRecord(MedicalRecord record) {
        return medicalRecordRepository.save(record);
    }
}
