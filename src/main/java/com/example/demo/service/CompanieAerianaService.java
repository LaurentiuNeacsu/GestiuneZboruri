package com.example.demo.service;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.repository.CompanieAerianaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanieAerianaService {
    @Autowired
    private CompanieAerianaRepository companieAerianaRepository;

    public void adaugaCompanieAeriana(CompanieAeriana companieAeriana) {
       companieAerianaRepository.adaugaCompanieAeriana(companieAeriana);
    }

    public CompanieAeriana vizualizareCompanieAerianaByID(Long id) {
        return companieAerianaRepository.vizualizareCompanieAerianaByID(id);
    }
}