package com.example.EHRS.Services;

import com.example.EHRS.Models.Patients;
import com.example.EHRS.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repo;

    public Patients create(Patients p) {
        return repo.save(p);
    }

    public List<Patients> getAll() {
        return repo.findAll();
    }

    public Patients getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Patients update(Long id, Patients p) {
        Patients pt = getById(id);
        if (pt != null) {
            pt.setName(p.getName());
//            pt.setAge(p.getAge());
            pt.setGender(p.getGender());
            pt.setContact(p.getContact());
            pt.setAddress(p.getAddress());
            return repo.save(pt);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
