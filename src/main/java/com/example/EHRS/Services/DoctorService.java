package com.example.EHRS.Services;

import com.example.EHRS.Models.Doctor;
import com.example.EHRS.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repo;

    public Doctor create(Doctor d) {
        return repo.save(d);
    }

    public List<Doctor> getAll() {
        return repo.findAll();
    }

    public Doctor getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Doctor update(Long id, Doctor d) {
        Doctor doc = getById(id);
        if (doc != null) {
            doc.setName(d.getName());
            doc.setSpecialization(d.getSpecialization());
            doc.setEmail(d.getEmail());
            doc.setPhone(d.getPhone());
            return repo.save(doc);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
