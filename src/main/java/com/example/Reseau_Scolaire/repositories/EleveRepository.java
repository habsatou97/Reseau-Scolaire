package com.example.Reseau_Scolaire.repositories;

import com.example.Reseau_Scolaire.models.Eleve;
import lombok.Lombok;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleveRepository extends JpaRepository<Eleve, Long> {
}
