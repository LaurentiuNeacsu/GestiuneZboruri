package com.example.demo.controller;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.service.CompanieAerianaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/gestiune/companiiAeriene")
public class CompanieAerianaController {
    @Autowired
    private CompanieAerianaService companieAerianaService;

    @GetMapping("/viewAll")
    public ResponseEntity<List<CompanieAeriana>> getAllCompaniiAeriene() {
        return ResponseEntity.ok(companieAerianaService.getAllCompaniiAeriene());
    }

    @PostMapping("/add")
    public ResponseEntity<String> addCompanieAeriana(@Valid @RequestBody CompanieAeriana companieAeriana) {
        companieAerianaService.addCompanieAeriana(companieAeriana);
        return ResponseEntity.accepted().body("Companie aeriana adaugata cu succes.");
    }

    @GetMapping("/viewByID/{id}")
    public ResponseEntity<CompanieAeriana> getCompanieAerianaByID(@PathVariable Long id) {
        return ResponseEntity.ok(companieAerianaService.getCompanieAerianaByID(id));
    }

    @DeleteMapping("/deleteByID/{id}")
    public ResponseEntity<String> deleteCompanieAerianaByID(@PathVariable Long id) {
        companieAerianaService.deleteCompanieAerianaByID(id);
        return ResponseEntity.accepted().body("Companie stearsa cu succes");
    }
}
