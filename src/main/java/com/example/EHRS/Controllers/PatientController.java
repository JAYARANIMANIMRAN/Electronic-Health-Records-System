package com.example.EHRS.Controllers;

import com.example.EHRS.Models.Appointment;
import com.example.EHRS.Models.MedicalRecord;
import com.example.EHRS.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
@CrossOrigin
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/{patientId}/appointments")
    public List<Appointment> getAppointments(@PathVariable Long patientId) {
        return patientService.getAppointments(patientId);
    }

    @GetMapping("/{patientId}/records")
    public List<MedicalRecord> getRecords(@PathVariable Long patientId) {
        return patientService.getRecords(patientId);
    }
}
