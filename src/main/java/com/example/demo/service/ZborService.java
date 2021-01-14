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

    public ZborRequest getZborByID(Long id) {
        return zborRepository.getZborByID(id);
    }

    public List<ZborRequest> getZborByRuta(String locatiePlecare, String locatieSosire) {
        return zborRepository.getZborByRuta(locatiePlecare, locatieSosire);
    }

    public void deleteZborByID(Long id) {
        zborRepository.deleteZborByID(id);
    }
}