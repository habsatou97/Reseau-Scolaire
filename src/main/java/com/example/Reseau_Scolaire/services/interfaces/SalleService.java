package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.Salle;

import java.util.List;

public interface SalleService {
    public Salle create(Salle salle);
    public List<Salle> getAllSalles();
    public Salle getSalleById(Long id);
    public Salle update(Long id,Salle salle);
    public boolean delete(Long id);
}
