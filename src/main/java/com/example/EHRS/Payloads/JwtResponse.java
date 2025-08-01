package com.example.EHRS.Payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class JwtResponse {
    private String token;
    private String email;
    private Set<String> roles;

}
