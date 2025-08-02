package com.example.EHRS.Services;

import com.example.EHRS.Models.Appointment;
import com.example.EHRS.Models.MedicalRecord;
import com.example.EHRS.Repository.AppointmentRepository;
import com.example.EHRS.Repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired private AppointmentRepository appointmentRepo;
    @Autowired private MedicalRecordRepository recordRepo;

    public List<Appointment> getAppointments(Long patientId) {
        return appointmentRepo.findByPatientId(patientId);
    }

    public List<MedicalRecord> getRecords(Long patientId) {
        return recordRepo.findByPatientId(patientId);
    }
}
