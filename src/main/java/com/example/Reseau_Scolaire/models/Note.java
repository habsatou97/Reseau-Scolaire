package com.example.Reseau_Scolaire.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue
    private Long id;
    private double evaluation;
    private double composition;
    @ManyToOne
    private Matiere matiere;
    @ManyToOne
    @JoinColumn(name = "note_id",referencedColumnName = "id")
    private Eleve eleve;
}
