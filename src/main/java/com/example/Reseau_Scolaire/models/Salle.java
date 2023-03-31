package com.example.Reseau_Scolaire.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "salles")
public class Salle {
    @Id
    @GeneratedValue
    private Long id;
    private Integer capaciteAccueil;
    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;

}
