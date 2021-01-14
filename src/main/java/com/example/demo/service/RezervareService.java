package com.example.demo.service;

import com.example.demo.models.Rezervare;
import com.example.demo.repository.RezervareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RezervareService {
    @Autowired
    private RezervareRepository rezervareRepository;

    public List<Rezervare> getRezervareByClientNume(String nume) {
        return rezervareRepository.getRezervareByClientNume(nume);
    }

    public void addRezervare(Rezervare rezervare) {
        rezervareRepository.addRezervare(rezervare);
    }

    public void deleteRezervareByID(Long id) {
        rezervareRepository.deleteRezervareByID(id);
    }
}