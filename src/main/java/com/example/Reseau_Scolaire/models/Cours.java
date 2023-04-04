package com.example.Reseau_Scolaire.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cours")
public class Cours {
    @Id
    @GeneratedValue
    private Long id;
    private Integer volumeHoraire;
    private LocalDateTime heureDebut;
    private LocalDateTime heureFin;
    @OneToOne
    @JoinColumn(name = "salle_id",referencedColumnName = "id")
    private Salle salle;
    @ManyToOne
    @JoinColumn(name = "enseignant_id",referencedColumnName = "id")
    private Enseignant enseignant;
    @ManyToMany
    private List<Etablissement> etablissements=new ArrayList<>();
    @ManyToMany
    private  List<Eleve> eleves=new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "matiere_id",referencedColumnName = "id")
    private Matiere matiere;

    public void addEtablissement(Etablissement etablissement){
        this.etablissements.add(etablissement);
    }
    public void addEleve(Eleve eleve){
        this.eleves.add(eleve);
    }
}
