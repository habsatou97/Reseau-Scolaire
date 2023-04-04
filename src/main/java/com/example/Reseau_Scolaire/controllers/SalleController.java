package com.example.Reseau_Scolaire.controllers;
import com.example.Reseau_Scolaire.models.Salle;
import com.example.Reseau_Scolaire.repositories.SalleRepository;
import com.example.Reseau_Scolaire.services.implementations.SalleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/reseauScolaire/v1/salles/")
public class SalleController {
    @Autowired
    private final SalleServiceImpl salleService;
    private final SalleRepository salleRepository;

    @GetMapping
    ResponseEntity<List<Salle>> get(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return ResponseEntity.ok(salleService.getAllSalles());
    }
    @PostMapping
    ResponseEntity<Salle> create(@RequestBody Salle salle){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return ResponseEntity.ok(salleService.create(salle));
    }
    @GetMapping(value = "{id}")
    ResponseEntity<Salle> getSalleById(@PathVariable Long id){
        return ResponseEntity.ok(salleService.getSalleById(id));
    }
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResponseEntity<Salle>update(@PathVariable Long id,@RequestBody Salle salle){
        return ResponseEntity.ok(salleService.update(id,salle));
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return salleService.delete(id);
    }
}
