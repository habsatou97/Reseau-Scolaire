package com.example.Reseau_Scolaire.repositories;

import com.example.Reseau_Scolaire.models.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
    public Enseignant getEnseignantByMatricule(String matricule);
}
