package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.Coordonnees;

import java.util.List;

public interface CoordoonneesService {
    public List<Coordonnees> get();
    public Coordonnees getById(Long id);
    public Coordonnees create(Coordonnees coordonnees);
    public Coordonnees update(Long id,Coordonnees coordonnees) throws Exception;
    public boolean delete(Long id) throws Exception;

}
