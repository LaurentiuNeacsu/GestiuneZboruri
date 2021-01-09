package com.example.demo.controller;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.repository.CompanieAerianaRepository;
import com.example.demo.service.CompanieAerianaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gestiune/companiiAeriene")
public class CompanieAerianaController {
    @Autowired
    private CompanieAerianaService companieAerianaService;

    @PostMapping("/add")
    public void adaugareCompanieAeriana(@RequestBody CompanieAeriana companieAeriana) {
        companieAerianaService.adaugaCompanieAeriana(companieAeriana);
    }

    @GetMapping("/viewByID/{id}")
    public CompanieAeriana vizualizareCompanieByID(@PathVariable Long id) {
        return companieAerianaService.vizualizareCompanieAerianaByID(id);
    }
}
