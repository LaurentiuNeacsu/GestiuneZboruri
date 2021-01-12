package com.example.demo.controller;

import com.example.demo.models.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/gestiune/clienti")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/viewAll")
    public ResponseEntity<List<Client>> getAllClienti() {
        return ResponseEntity.ok(clientService.getAllClienti());
    }

    @PostMapping("/add")
    public ResponseEntity<String> addClient(@RequestBody Client client) {
        clientService.addClient(client);
        return ResponseEntity.accepted().body("Clientul a fost adaugat cu succes");
    }

    @GetMapping("/viewByID/{id}")
    public ResponseEntity<Client> getClientByID(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.getClientByID(id));
    }

    @GetMapping("/viewByNume")
    public ResponseEntity<Client> getClientByNume(@RequestParam String nume) {
        return ResponseEntity.ok(clientService.getClientByNume(nume));
    }
}