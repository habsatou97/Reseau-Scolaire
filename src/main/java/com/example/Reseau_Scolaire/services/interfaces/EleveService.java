package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.Eleve;

import java.util.List;

public interface EleveService {
    public List<Eleve> getAllEleves();
    public Eleve createEleve(Eleve eleve);
    public Eleve getEleveById(Long id);
    public Eleve updateEleve(Long id,Eleve eleve);
    public boolean deleteEleve(Long id);
}
