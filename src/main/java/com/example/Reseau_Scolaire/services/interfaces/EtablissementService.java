package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.Etablissement;

import java.util.List;

public interface EtablissementService {
    public List<Etablissement> getAllEtablissements();
    public Etablissement create(Etablissement etablissement);
    public Etablissement getEtablissementById(Long id);
    public Etablissement updateEtablissement(Long id,Etablissement etablissement);
    public boolean deleteEtablissement(Long id);

}
