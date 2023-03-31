package com.example.Reseau_Scolaire.repositories;

import com.example.Reseau_Scolaire.models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours,Long> {

}
