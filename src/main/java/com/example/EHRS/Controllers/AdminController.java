//package com.example.EHRS.Controllers;
//
//import com.example.EHRS.Models.User;
//import com.example.EHRS.Services.AdminService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/admin")
//@CrossOrigin
//public class AdminController {
//
//    @Autowired
//    private AdminService adminService;
//
//    @PostMapping("/doctor")
//    public User createDoctor(@RequestBody User doctor) {
//        return adminService.createDoctor(doctor);
//    }
//
//    @PostMapping("/receptionist")
//    public User createReceptionist(@RequestBody User receptionist) {
//        return adminService.createReceptionist(receptionist);
//    }
//}

package com.example.EHRS.Controllers;

import com.example.EHRS.Models.User;
import com.example.EHRS.Services.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/doctor")
    public User createDoctor(@RequestBody User doctor) {
        return adminService.createDoctor(doctor);
    }

    @PostMapping("/receptionist")
    public User createReceptionist(@RequestBody User receptionist) {
        return adminService.createReceptionist(receptionist);
    }

    // ✅ NEW: Get all users (doctors + receptionists)
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return adminService.getAllUsers();
    }

    // Optional: Get all doctors only
    @GetMapping("/doctors")
    public List<User> getAllDoctors() {
        return adminService.getAllDoctors();
    }

    // Optional: Get all receptionists only
    @GetMapping("/receptionists")
    public List<User> getAllReceptionists() {
        return adminService.getAllReceptionists();
    }
}

