package com.example.Reseau_Scolaire.models;

import com.example.Reseau_Scolaire.enumerations.Niveau;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "eleves")
public class Eleve {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "numerotelephonetuteur",nullable = false,length = 9)
    private String numeroTelephoneTuteur;
    @Column(name = "adresse",nullable = false)
    private String adresse;
    @Column(name = "anneeentree",nullable = false,length = 4,unique = true)
    private Integer anneeEntree;
    @Column(name = "niveau",nullable = false,unique = true)
    private Niveau niveau;
    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;
    @ManyToMany
    private List<Cours> cours=new ArrayList<>();
    @OneToMany(mappedBy = "eleve",fetch = FetchType.EAGER,orphanRemoval = true)
    private List<Note> notes=new ArrayList<>();

    public void addCours(Cours cours){
        this.cours.add(cours);
    }
    public void addNote(Note note){
        this.notes.add(note);
    }
}
