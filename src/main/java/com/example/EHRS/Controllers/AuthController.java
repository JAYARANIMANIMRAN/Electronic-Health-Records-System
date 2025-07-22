package com.example.EHRS.Controllers;

import com.example.EHRS.Models.Users;
import com.example.EHRS.Jwt.JwtUtil;
import com.example.EHRS.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public String register(@RequestBody Users user) {
        userService.register(user);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        Users existing = userService.getByUsername(user.getUsername());
        if (existing != null && new BCryptPasswordEncoder().matches(user.getPassword(), existing.getPassword())) {
            return jwtUtil.generateToken(existing.getUsername());
        }
        return "Invalid credentials";
    }
}
