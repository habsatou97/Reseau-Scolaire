package com.example.Reseau_Scolaire.services.implementations;

import com.example.Reseau_Scolaire.models.Coordonnees;
import com.example.Reseau_Scolaire.repositories.CoordonneesRepository;
import com.example.Reseau_Scolaire.services.interfaces.CoordoonneesService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@Transactional
@Builder
public class CoordonneesServiceImpl implements CoordoonneesService {
    private final CoordonneesRepository coordonneesRepository;

    @Override
    public List<Coordonnees> get() {
        return coordonneesRepository.findAll();
    }

    @Override
    public Coordonnees getById(Long id) {
        Optional<Coordonnees> existingcoordonnees=coordonneesRepository.findById(id);
        if(existingcoordonnees.isPresent()){
            return  existingcoordonnees.get();
        }
        throw new IllegalArgumentException("Des coordonnees avec cet Id n'exsitent pas");
    }

    @Override
    public Coordonnees create(Coordonnees coordonnees) {
        System.out.println("########################################");
        if(coordonnees.getAdresse()==null || coordonnees.getNumeroTelephone()==null)
            throw new IllegalArgumentException("L'adresse ou le numero de telephone ne pevent etre nuls");
        else
            return coordonneesRepository.saveAndFlush(coordonnees);

//        Coordonnees coordonnees1=new Coordonnees();
//        coordonnees1.setAdresse(coordonnees.getAdresse());
//        coordonnees1.setNumeroTelephone(coordonnees.getNumeroTelephone());
//        coordonnees1.setSiteInternet(coordonnees.getSiteInternet());
//        return coordonneesRepository.save(coordonnees1);
    }

    @Override
    public Coordonnees update(Long id, Coordonnees coordonnees) throws Exception {
        Optional<Coordonnees> existingcoordonnees=coordonneesRepository.findById(id);
        if(existingcoordonnees.isPresent()){
            existingcoordonnees.get().setSiteInternet(coordonnees.getSiteInternet());
            existingcoordonnees.get().setNumeroTelephone(coordonnees.getNumeroTelephone());
            existingcoordonnees.get().setAdresse(coordonnees.getAdresse());
            return coordonneesRepository.save(existingcoordonnees.get());
        }
        throw new Exception("Des coordonnees avec un tel identifiant n'existent pas");
    }

    @Override
    public boolean delete(Long id) throws Exception {
        Optional<Coordonnees> existingcoordonnees = coordonneesRepository.findById(id);
        if (existingcoordonnees.isPresent()) {
            coordonneesRepository.deleteById(id);
            return true;
        }
            //throw new Exception("Des coordonnees avec un tel identifiant n'existent pas");
            return false;
    }
}
