package com.example.Reseau_Scolaire.controllers;

import com.example.Reseau_Scolaire.models.Coordonnees;
import com.example.Reseau_Scolaire.services.implementations.CoordonneesServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reseauScolaire/v1/coordonnees/")
public class CoordonneesController {
    @Autowired
    private final CoordonneesServiceImpl coordonneesService;

    @GetMapping
    public ResponseEntity<List<Coordonnees>> getAll(){
        System.out.println("########################################");
        return ResponseEntity.ok(coordonneesService.get());
    }
    @GetMapping(value = "{id}")
    public ResponseEntity<Coordonnees> getById(@PathVariable Long id){
        System.out.println("########################################");
        return ResponseEntity.ok(coordonneesService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Coordonnees> create(@RequestBody Coordonnees coordonnees){
        System.out.println("########################################");
        return  ResponseEntity.ok(coordonneesService.create(coordonnees));
    }
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResponseEntity<Coordonnees> update(@RequestBody Coordonnees coordonnees,@PathVariable Long id) throws Exception {
        System.out.println("########################################");
        return ResponseEntity.ok(coordonneesService.update(id,coordonnees));
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id) throws Exception {
        System.out.println("########################################");
        return coordonneesService.delete(id);
    }
}
