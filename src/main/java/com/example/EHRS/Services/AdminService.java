package com.example.EHRS.Services;

import com.example.EHRS.Models.User;
import com.example.EHRS.Repository.UserRepository;
import com.example.EHRS.enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired private UserRepository userRepo;
    @Autowired private PasswordEncoder passwordEncoder;

    public User createDoctor(User user) {
        user.setRole("DOCTOR");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public User createReceptionist(User user) {
        user.setRole("RECEPTIONIST");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll(); // You may want to filter by roles here
    }

    public List<User> getAllDoctors() {
        return userRepo.findByRole(Role.DOCTOR);
    }

    public List<User> getAllReceptionists() {
        return userRepo.findByRole(Role.RECEPTIONIST);
    }

}
