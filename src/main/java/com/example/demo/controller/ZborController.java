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

    @GetMapping("/viewByID/{id}")
    public ResponseEntity<ZborRequest> getZborByID(@PathVariable Long id) {
        return ResponseEntity.ok(zborService.getZborByID(id));
    }

    @GetMapping("/viewByRuta")
    public ResponseEntity<List<ZborRequest>> getZborByRuta(@RequestParam String locatiePlecare, @RequestParam String locatieSosire) {
        return ResponseEntity.ok().body(zborService.getZborByRuta(locatiePlecare, locatieSosire));
    }

    @DeleteMapping("/deleteByID/{id}")
    public ResponseEntity<String> deleteZborByID(@PathVariable Long id) {
        zborService.deleteZborByID(id);
        return ResponseEntity.accepted().body("Zbor sters cu succes");
    }
}