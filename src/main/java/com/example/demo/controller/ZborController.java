package com.example.demo.controller;

import com.example.demo.mapper.ZborRequestToZborMapper;
import com.example.demo.models.*;
import com.example.demo.request_templates.ZborRequest;
import com.example.demo.service.ZborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/gestiune/zboruri")
public class ZborController {
    @Autowired
    private ZborService service;

    @RequestMapping("/viewAll")
    public List<Zbor> getAllZboruri() {
        return service.getAllZboruri();
    }

    @PostMapping("/add")
    public ResponseEntity<String> adaugaZbor(@Valid @RequestBody ZborRequest zborRequest) {
        Zbor zborCreat = ZborRequestToZborMapper.mapZborRequestToZborDBObject(zborRequest);
        service.adaugaZbor(zborCreat);
        return ResponseEntity
                .created(URI.create("/viewByID/" + zborCreat.getZborID()))
                .body("FCSB = STEAUA");
    }

    @PostMapping("/editByID")
    public void editZbor(int zborID) {
        service.modificaZbor(zborID);
    }

    @GetMapping("/viewByID/{id}")
    public Zbor vizualizeazaZbor(@PathVariable Long id) {
        return service.vizualizeazaZborByID(id);
    }

    @GetMapping("/viewByLocatiePlecare")
    public Zbor vizualizeazaZborDupaLocatiePlecare(String locatie) {
        return service.vizualizeazaZborDupaLocatiePlecare(locatie);
    }

    @GetMapping("/viewByLocatieSosire")
    public Zbor vizualizeazaZborDupaLocatieSosire(String locatie) {
        return service.vizualizeazaZborDupaLocatieSosire(locatie);
    }
}
