package com.example.EHRS.Controllers;

import com.example.EHRS.Models.Doctor;
import com.example.EHRS.Models.Patients;
import com.example.EHRS.Models.Receptionist;
import com.example.EHRS.Services.DoctorService;
import com.example.EHRS.Services.PatientService;
import com.example.EHRS.Services.ReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private ReceptionistService receptionistService;

    // ✅ Create Doctor
    @PostMapping("/create-doctor")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.create(doctor);
    }

    // ✅ Create Patient
    @PostMapping("/create-patient")
    public Patients createPatient(@RequestBody Patients patient) {
        return patientService.create(patient);
    }

    // ✅ Create Receptionist
    @PostMapping("/create-receptionist")
    public Receptionist createReceptionist(@RequestBody Receptionist receptionist) {
        return receptionistService.create(receptionist);
    }
}
