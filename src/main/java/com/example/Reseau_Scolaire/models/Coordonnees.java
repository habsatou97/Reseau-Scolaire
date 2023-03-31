package com.example.Reseau_Scolaire.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coordonnees")
public class Coordonnees {
    @Id
    @GeneratedValue
    private Long id;
    private String siteInternet;
    @Column(name = "adresse",nullable = false)
    private String adresse;
    @Column(name = "numerotelephone",nullable = false,length = 9)
    private String numeroTelephone;
}
