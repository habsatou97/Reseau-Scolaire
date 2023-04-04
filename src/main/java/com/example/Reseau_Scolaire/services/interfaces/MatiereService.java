package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.Matiere;

import java.util.List;

public interface MatiereService {
    public Matiere createMatiere(Matiere matiere);
    public List<Matiere> getAllMatieres();
    public Matiere getMatiereById(long id);
    public Matiere updateMatiere(Long id,Matiere matiere);
    public boolean deleteMatiere(Long id);
}
