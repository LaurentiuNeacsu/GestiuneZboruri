package com.example.demo.service;

import com.example.demo.models.Avion;
import com.example.demo.repository.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AvionService {
    @Autowired
    private AvionRepository avionRepository;

    public List<Avion> getAvioaneByCompanyAndAvailability(String companieNume) {
        return avionRepository.getAvioaneByCompanyAndAvailability(companieNume);
    }

    public void addAvion(Avion avion) {
        avionRepository.addAvion(avion);
    }
}