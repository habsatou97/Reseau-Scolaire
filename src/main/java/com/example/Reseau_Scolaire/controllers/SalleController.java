package com.example.Reseau_Scolaire.controllers;

import com.example.Reseau_Scolaire.models.Salle;
import com.example.Reseau_Scolaire.services.implementations.SalleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/reseauScolaire/v1/salles/")
public class SalleController {
    @Autowired
    private final SalleServiceImpl salleService;
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
}
