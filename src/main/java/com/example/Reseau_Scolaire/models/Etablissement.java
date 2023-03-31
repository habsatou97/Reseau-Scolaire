package com.example.Reseau_Scolaire.models;

import com.example.Reseau_Scolaire.enumerations.ManagerType;
import com.example.Reseau_Scolaire.enumerations.TypeEtablissement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "etablissements")


public class Etablissement {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nometablissement",nullable = false)
    private String nomEtablissement;
    @Column(name = "typeetablissement",nullable = false)
    private TypeEtablissement typeEtablissement;
    @Column(name = "datecreation",nullable = false)
    private Date dateCreation;
    @Column(name = "manager",unique = true,nullable = false)
    private ManagerType managerType;
    @OneToOne
    @JoinColumn(name = "coordonnees_id")
    private Coordonnees coordonnees;
    @OneToMany(mappedBy = "etablissement",orphanRemoval = true,fetch = FetchType.EAGER)
     private List<Eleve> eleves=new ArrayList<>();
    @OneToMany(mappedBy ="etablissementService",orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Enseignant> enseignants=new ArrayList<>();
    @OneToMany(mappedBy = "etablissement",fetch = FetchType.EAGER,orphanRemoval = true)
    private List<Salle> salles=new ArrayList<>();
    @ManyToMany(mappedBy = "etablissements")
    private List<Cours>cours=new ArrayList<>();
}
