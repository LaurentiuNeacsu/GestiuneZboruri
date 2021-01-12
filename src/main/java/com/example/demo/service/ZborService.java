package com.example.demo.service;

import com.example.demo.models.Zbor;
import com.example.demo.repository.ZborRepository;
import com.example.demo.request_templates.ZborRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ZborService {
    @Autowired
    private ZborRepository zborRepository;

    public List<ZborRequest> getAllZboruri() {
        return zborRepository.getAllZboruri();
    }

    public void addZbor(Zbor zbor) {
        zborRepository.addZbor(zbor);
    }

    public void modificaZbor(int id) {
        zborRepository.modificaZbor(id);
    }

    public Zbor stergeZbor(int id) {
        return zborRepository.stergeZbor(id);
    }

    public Zbor getZborByID(Long id) {
        return zborRepository.getZborByID(id);
    }

    public Zbor vizualizeazaZborDupaLocatiePlecare(String locatie) {
        return zborRepository.vizualizeazaZborDupaLocatiePlecare(locatie);
    }

    public Zbor vizualizeazaZborDupaLocatieSosire(String locatie) {
        return zborRepository.vizualizeazaZborDupaLocatieSosire(locatie);
    }
}
