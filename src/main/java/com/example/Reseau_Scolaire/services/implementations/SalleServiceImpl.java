package com.example.Reseau_Scolaire.services.implementations;

import com.example.Reseau_Scolaire.models.Salle;
import com.example.Reseau_Scolaire.repositories.SalleRepository;
import com.example.Reseau_Scolaire.services.interfaces.SalleService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Builder
@Data

public class SalleServiceImpl implements SalleService {
    private final SalleRepository salleRepository;
    @Override
    public Salle create(Salle salle) {
        Salle salle1=new Salle();
        salle1.setCapaciteAccueil(salle.getCapaciteAccueil());
        return (salleRepository.save(salle1));
    }

    @Override
    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    @Override
    public Salle getSalleById(Long id) {
        Optional<Salle> existingSalle=salleRepository.findById(id);
        if(existingSalle.isPresent())
            return existingSalle.get();
        else
            throw new IllegalArgumentException("Une salle avec cet id n'existe pas!!!");
    }

    @Override
    public Salle update(Long id, Salle salle) {
        Optional<Salle> existingSalle=salleRepository.findById(id);
        if(existingSalle.isPresent()){
            Salle salle1=existingSalle.get();
            if(salle.getCapaciteAccueil()==null)
                throw new IllegalArgumentException("Le corpsde la requete ne peut pas etre vide");
            else
            salle1.setCapaciteAccueil(salle.getCapaciteAccueil());
            return salleRepository.save(salle1);
        }
        else
            throw new IllegalArgumentException("Une salle avec cet id n'existe pas!!!");
    }

    @Override
    public boolean delete(Long id) {
        Optional<Salle> existingSalle=salleRepository.findById(id);
        if(existingSalle.isPresent()){
            salleRepository.deleteById(id);
            return true;
        }
        else
            return false;
    }
}
