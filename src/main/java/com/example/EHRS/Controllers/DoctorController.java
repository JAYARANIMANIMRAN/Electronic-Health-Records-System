package com.example.EHRS.Controllers;

import com.example.EHRS.Models.Appointment;
import com.example.EHRS.Models.MedicalRecord;
import com.example.EHRS.Models.Patient;
import com.example.EHRS.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/appointments/{doctorId}")
    public List<Appointment> getAppointments(@PathVariable Long doctorId) {
        return doctorService.getAppointments(doctorId);
    }

    @GetMapping("/patients")
    public List<Patient> getAllPatients() {
        return doctorService.getAllPatients();
    }

    @GetMapping("/records/{patientId}")
    public List<MedicalRecord> getPatientRecords(@PathVariable Long patientId) {
        return doctorService.getRecords(patientId);
    }
}
