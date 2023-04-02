package com.example.Reseau_Scolaire.controllers;

import com.example.Reseau_Scolaire.models.Salle;
import com.example.Reseau_Scolaire.services.implementations.SalleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/reseauScolaire/v1/salles/")
public class SalleController {
    private final SalleServiceImpl salleService;
    @GetMapping
    ResponseEntity<List<Salle>> get(){
        return ResponseEntity.ok(salleService.getAllSalles());
    }
}
