package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.Enseignant;

import java.util.List;

public interface EnseignantService {
    public List<Enseignant> getAllEnsignants();
    public Enseignant createEnseignant(Enseignant enseignant);
    public Enseignant getEnseignantById(Long id);
    public Enseignant updateEnseignant(Long id,Enseignant enseignant);
    public boolean deleteEnseignant(Long id);

}
