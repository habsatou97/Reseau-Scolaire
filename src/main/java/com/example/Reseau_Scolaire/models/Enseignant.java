package com.example.Reseau_Scolaire.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enseignants")
public class Enseignant {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "matricule",unique = true,nullable = false)
    private String matricule;
    @Column(name = "adresse",unique = true,nullable = false)
    private String adresse;
    @Column(name = "datenaissance",nullable = false)
    private Date datenaissance;
    @Column(name = "datedebutservice",nullable = false)
    private Date dateDebutService;
    @ManyToOne
    @JoinColumn(name = "etablissement_service_id",referencedColumnName = "id")
    private Etablissement etablissementService;
    @OneToMany
    @JoinColumn(name ="cours_id" ,referencedColumnName = "id")
    private List<Cours> cours=new ArrayList<>();

    public void addCours(Cours cours){
        this.cours.add(cours);
    }

}
