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
@Service
@Builder
@Data

public class SalleServiceImpl implements SalleService {
    private final SalleRepository salleRepository;
    @Override
    public Salle create(Salle salle) {
        Salle salle1=new Salle();
        salle1.setCapaciteAccueil(50);
        return (salleRepository.save(salle1));
    }

    @Override
    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    @Override
    public Salle getSalleById(Long id) {
        return null;
    }

    @Override
    public Salle update(Long id, Salle salle) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
