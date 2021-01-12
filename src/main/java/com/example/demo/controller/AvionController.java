package com.example.demo.controller;

import com.example.demo.mapper.AvionRequestToAvionMapper;
import com.example.demo.models.Avion;
import com.example.demo.request_templates.AvionRequest;
import com.example.demo.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/gestiune/avioane")
public class AvionController {
    @Autowired
    private AvionService avionService;

    @Autowired
    private AvionRequestToAvionMapper avionRequestToAvionMapper;

    @GetMapping("/viewByCompNameAndAvail/{numeCompanie}")
    public ResponseEntity<List<Avion>> getAvioaneByCompanyAndAvailability(@PathVariable String numeCompanie) {
        return ResponseEntity.ok(avionService.getAvioaneByCompanyAndAvailability(numeCompanie));
    }

    @PostMapping("/add")
    public ResponseEntity<String> addAvion(@Valid @RequestBody AvionRequest avionRequest) {
        Avion avionCreat = avionRequestToAvionMapper.mapAvionRequestToAvionDBObject(avionRequest);
        avionService.addAvion(avionCreat);
        return ResponseEntity.accepted().body("Avion adaugat cu succes.");
    }
}