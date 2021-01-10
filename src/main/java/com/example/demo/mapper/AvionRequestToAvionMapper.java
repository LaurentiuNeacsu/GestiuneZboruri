package com.example.demo.mapper;

import com.example.demo.models.Avion;
import com.example.demo.repository.CompanieAerianaRepository;
import com.example.demo.request_templates.AvionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AvionRequestToAvionMapper {
    @Autowired
    private CompanieAerianaRepository companieAerianaRepository;

    public Avion mapAvionRequestToAvionDBObject(AvionRequest avionRequest) {
        return new Avion(avionRequest.getNume(),
                         avionRequest.getCapacitate(),
                         companieAerianaRepository.getCompanieAerianaIDByNume(avionRequest.getCompanieAeriana().getNumeCompanie()),
                         false);
    }
}
