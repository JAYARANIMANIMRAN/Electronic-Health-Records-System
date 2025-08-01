package com.example.EHRS.Payloads;

import com.example.EHRS.Enum.Role;
import lombok.Data;

@Data
public class SignupRequest {
    private String name;
    private String email;
    private String password;
    private Role role;
}
