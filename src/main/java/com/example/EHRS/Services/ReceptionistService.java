package com.example.EHRS.Services;

import com.example.EHRS.Models.Receptionist;
import com.example.EHRS.Repository.ReceptionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionistService {

    @Autowired
    private ReceptionistRepository repo;

    public Receptionist create(Receptionist r) {
        return repo.save(r);
    }

    public List<Receptionist> getAll() {
        return repo.findAll();
    }

    public Receptionist getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Receptionist update(Long id, Receptionist r) {
        Receptionist rec = getById(id);
        if (rec != null) {
            rec.setName(r.getName());
            rec.setEmail(r.getEmail());
            rec.setPhone(r.getPhone());
            return repo.save(rec);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
