package com.example.demo.controller;

import com.example.demo.mapper.ZborRequestToZborMapper;
import com.example.demo.models.*;
import com.example.demo.request_templates.ZborRequest;
import com.example.demo.service.ZborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/gestiune/zboruri")
public class ZborController {
    @Autowired
    private ZborService zborService;

    @Autowired
    private ZborRequestToZborMapper zborRequestToZborMapper;

    @RequestMapping("/viewAll")
    public ResponseEntity<List<ZborRequest>> getAllZboruri() {
        return ResponseEntity.ok(zborService.getAllZboruri());
    }

    @PostMapping("/add")
    public ResponseEntity<String> addZbor(@Valid @RequestBody ZborRequest zborRequest) {
        Zbor zborCreat = zborRequestToZborMapper.mapZborRequestToZborDBObject(zborRequest);
        zborService.addZbor(zborCreat);
        return ResponseEntity.accepted().body("Zbor adaugat cu succes.");
    }

    @PostMapping("/editByID")
    public void editZbor(int zborID) {
        zborService.modificaZbor(zborID);
    }

    @GetMapping("/viewByID/{id}")
    public Zbor getZborByID(@PathVariable Long id) {
        return zborService.getZborByID(id);
    }

    @GetMapping("/viewByLocatiePlecare")
    public Zbor vizualizeazaZborDupaLocatiePlecare(String locatie) {
        return zborService.vizualizeazaZborDupaLocatiePlecare(locatie);
    }

    @GetMapping("/viewByLocatieSosire")
    public Zbor vizualizeazaZborDupaLocatieSosire(String locatie) {
        return zborService.vizualizeazaZborDupaLocatieSosire(locatie);
    }
}
