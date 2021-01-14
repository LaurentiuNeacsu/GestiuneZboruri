package com.example.demo.service;

import com.example.demo.models.Escala;
import com.example.demo.repository.EscalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EscalaService {
    @Autowired
    private EscalaRepository escalaRepository;

    public List<Escala> getEscalaByZborID(Long id) {
        return escalaRepository.getEscalaByZborID(id);
    }

    public void addEscala(Escala escala) {
        escalaRepository.addEscala(escala);
    }

    public void deleteEscalaByID(Long id) {
        escalaRepository.deleteEscalaByID(id);
    }
}