package com.example.Reseau_Scolaire.repositories;

import com.example.Reseau_Scolaire.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {
}
