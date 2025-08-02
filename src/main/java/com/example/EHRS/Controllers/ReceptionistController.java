package com.example.EHRS.Controllers;

import com.example.EHRS.Models.Appointment;
import com.example.EHRS.Models.MedicalRecord;
import com.example.EHRS.Models.Patient;
import com.example.EHRS.Services.ReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receptionist")
@CrossOrigin
public class ReceptionistController {

    @Autowired
    private ReceptionistService receptionistService;

    // Add patient
    @PostMapping("/patient")
    public Patient addPatient(@RequestBody Patient patient) {
        return receptionistService.addPatient(patient);
    }

    // Get all patients
    @GetMapping("/patients")
    public List<Patient> getAllPatients() {
        return receptionistService.getAllPatients();
    }

    // Get patient by ID
    @GetMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return receptionistService.getPatientById(id);
    }

    // Add appointment
    @PostMapping("/appointment")
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return receptionistService.addAppointment(appointment);
    }

    // Add medical record
    @PostMapping("/record")
    public MedicalRecord addMedicalRecord(@RequestBody MedicalRecord record) {
        return receptionistService.addMedicalRecord(record);
    }
}
