package com.example.demo.controller;

import com.example.demo.models.Rezervare;
import com.example.demo.service.RezervareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/gestiune/rezervari")
public class RezervareController {
    @Autowired
    private RezervareService rezervareService;

    @GetMapping("/viewByClientNume")
    public ResponseEntity<List<Rezervare>> getRezervareByClientNume(@RequestParam String nume) {
        return ResponseEntity.ok(rezervareService.getRezervareByClientNume(nume));
    }

    @PostMapping("/add")
    public ResponseEntity<String> addRezervare(@Valid @RequestBody Rezervare rezervare) {
        rezervareService.addRezervare(rezervare);
        return ResponseEntity.accepted().body("Rezervare adaugata cu succes");
    }

    @DeleteMapping("/deleteByID/{id}")
    public ResponseEntity<String> deleteRezervareByID(@PathVariable Long id) {
        rezervareService.deleteRezervareByID(id);
        return ResponseEntity.accepted().body("Rezervare stearsa cu succes");
    }
}
