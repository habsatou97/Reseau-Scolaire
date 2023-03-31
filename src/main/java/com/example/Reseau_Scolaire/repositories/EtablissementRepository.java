package com.example.Reseau_Scolaire.repositories;

import com.example.Reseau_Scolaire.models.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRepository extends JpaRepository<Etablissement,Long> {
}
