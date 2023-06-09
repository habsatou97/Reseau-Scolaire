package com.example.Reseau_Scolaire.models;

import com.example.Reseau_Scolaire.enumerations.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "prenom",nullable = false)
    private String prenom;
    @Column(name = "nom",nullable = false)
    private String nom;
    @Column(name = "numerotelephone",nullable = false,length = 9,unique = true)
    private String numeroTelephone;
    private Role role;
    @Column(name = "email",nullable = false,unique = true)
    private String email;
}
