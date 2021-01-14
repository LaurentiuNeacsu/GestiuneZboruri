package com.example.demo.controller;

import com.example.demo.models.Locatie;
import com.example.demo.service.LocatieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/gestiune/locatii")
public class LocatieController {
    @Autowired
    private LocatieService locatieService;

    @GetMapping("/viewAll")
    public ResponseEntity<List<Locatie>> getAllLocatii() {
        return ResponseEntity.ok().body(locatieService.getAllLocatii());
    }

    @PostMapping("/add")
    public ResponseEntity<String> addLocatie(@Valid @RequestBody Locatie locatie) {
        locatieService.addLocatie(locatie);
        return ResponseEntity.accepted().body("Locatie adaugata cu succes.");
    }

    @DeleteMapping("/deleteByID/{id}")
    public ResponseEntity<String> deleteLocatieByID(@PathVariable Long id) {
        locatieService.deleteLocatieByID(id);
        return ResponseEntity.accepted().body("Locatie stearsa cu succes");
    }
}
