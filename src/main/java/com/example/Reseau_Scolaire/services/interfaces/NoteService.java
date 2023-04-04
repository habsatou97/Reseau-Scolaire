package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.Note;

import java.util.List;

public interface NoteService {
    public Note crateNote(Note note);
    public List<Note> getAllNotes();
    public Note getNoteById(Long id);
    public Note updateNote(Long id,Note note);
    public boolean deleteNote(Long id);
}
