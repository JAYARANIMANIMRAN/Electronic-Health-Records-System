package com.example.EHRS.Services;


import com.example.EHRS.Models.Users;
import com.example.EHRS.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {

        @Autowired
        private UserRepository userRepo;

        @Autowired
        private PasswordEncoder passwordEncoder;

        public Users register(Users user) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepo.save(user);
        }

        public Users getByUsername(String username) {
            return userRepo.findByUsername(username).orElse(null);
        }


}
