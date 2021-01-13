package com.example.demo.controller;

import com.example.demo.models.Escala;
import com.example.demo.service.EscalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/gestiune/escale")
public class EscalaController {
    @Autowired
    private EscalaService escalaService;

    @GetMapping("/viewByZborID/{id}")
    public ResponseEntity<List<Escala>> getEscalaByZborID(@PathVariable Long id) {
        return ResponseEntity.ok(escalaService.getEscalaByZborID(id));
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEscala(@RequestBody Escala escala) {
        escalaService.addEscala(escala);
        return ResponseEntity.accepted().body("Escala adaugata cu succes");
    }
}