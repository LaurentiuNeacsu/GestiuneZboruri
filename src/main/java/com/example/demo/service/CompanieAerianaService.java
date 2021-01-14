package com.example.demo.service;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.repository.CompanieAerianaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanieAerianaService {
    @Autowired
    private CompanieAerianaRepository companieAerianaRepository;

    public List<CompanieAeriana> getAllCompaniiAeriene() {
        return companieAerianaRepository.getAllCompaniiAeriene();
    }

    public void addCompanieAeriana(CompanieAeriana companieAeriana) {
       companieAerianaRepository.addCompanieAeriana(companieAeriana);
    }

    public CompanieAeriana getCompanieAerianaByID(Long id) {
        return companieAerianaRepository.getCompanieAerianaByID(id);
    }

    public void deleteCompanieAerianaByID(Long id) {
        companieAerianaRepository.deleteCompanieAerianaByID(id);
    }
}