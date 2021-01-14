package com.example.demo.service;

import com.example.demo.models.Locatie;
import com.example.demo.repository.LocatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocatieService {
    @Autowired
    private LocatieRepository locatieRepository;

    public List<Locatie> getAllLocatii() {
        return locatieRepository.getAllLocatii();
    }

    public void addLocatie(Locatie locatie) {
        locatieRepository.addLocatie(locatie);
    }

    public void deleteLocatieByID(Long id) {
        locatieRepository.deleteLocatieByID(id);
    }
}