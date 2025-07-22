package com.example.EHRS.Models;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

        @Id
        @GeneratedValue
        private Long id;

        private String username;
        private String password;
    }

}
