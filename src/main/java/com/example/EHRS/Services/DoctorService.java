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
public class DoctorService {

    @Autowired private AppointmentRepository appointmentRepo;
    @Autowired private MedicalRecordRepository recordRepo;
    @Autowired private PatientRepository patientRepo;

    public List<Appointment> getAppointments(Long doctorId) {
        return appointmentRepo.findByDoctorId(doctorId);
    }

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }

    public List<MedicalRecord> getRecords(Long patientId) {
        return recordRepo.findByPatientId(patientId);
    }
}
