package com.example.Reseau_Scolaire.repositories;

import com.example.Reseau_Scolaire.models.Coordonnees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoordonneesRepository extends JpaRepository<Coordonnees,Long> {
}
