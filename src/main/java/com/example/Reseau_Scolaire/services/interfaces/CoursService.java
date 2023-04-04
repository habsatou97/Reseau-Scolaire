package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.Cours;

import java.util.List;

public interface CoursService {
    public Cours createCours(Cours cours);
    public List<Cours> getAllCours();
    public Cours getCoursById(Long id);
    public Cours updateCours(Cours cours,Long id);
    public boolean deleteCours(Long id);
}
