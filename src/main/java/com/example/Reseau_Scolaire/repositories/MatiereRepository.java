package com.example.Reseau_Scolaire.repositories;

import com.example.Reseau_Scolaire.models.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepository extends JpaRepository<Matiere,Long> {
    public Matiere getMatiereByIntitule(String intitule);
}
