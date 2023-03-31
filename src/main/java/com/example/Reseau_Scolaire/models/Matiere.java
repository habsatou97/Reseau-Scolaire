package com.example.Reseau_Scolaire.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "matiere")
public class Matiere {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "intitule",unique = true,nullable = false)
    private  String intitule;
    @OneToMany(mappedBy = "matiere")
    private List<Note> notes=new ArrayList<>();
    @OneToMany(mappedBy = "matiere")
    private List<Cours> cours=new ArrayList<>();


}
