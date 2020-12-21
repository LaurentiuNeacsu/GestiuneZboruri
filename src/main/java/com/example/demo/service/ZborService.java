package com.example.demo.service;

import com.example.demo.models.Zbor;
import com.example.demo.repository.ZborRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ZborService {
    @Autowired
    private ZborRepository zborRepository;

    public List<Zbor> getAllZboruri() {
        return zborRepository.getAllZboruri();
    }

    public void adaugaZbor(Zbor zbor) {
        zborRepository.adaugaZbor(zbor);
    }

    public void modificaZbor(int id) {
        zborRepository.modificaZbor(id);
    }

    public Zbor stergeZbor(int id) {
        return zborRepository.stergeZbor(id);
    }

    public Zbor vizualizeazaZbor(int id) {
        return zborRepository.vizualizeazaZbor(id);
    }

    public Zbor vizualizeazaZborDupaLocatiePlecare(String locatie) {
        return zborRepository.vizualizeazaZborDupaLocatiePlecare(locatie);
    }

    public Zbor vizualizeazaZborDupaLocatieSosire(String locatie) {
        return zborRepository.vizualizeazaZborDupaLocatieSosire(locatie);
    }
}
