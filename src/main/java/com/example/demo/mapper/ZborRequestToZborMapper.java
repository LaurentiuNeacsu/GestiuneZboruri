package com.example.demo.mapper;

import com.example.demo.models.Zbor;
import com.example.demo.repository.CompanieAerianaRepository;
import com.example.demo.repository.LocatieRepository;
import com.example.demo.request_templates.ZborRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZborRequestToZborMapper {
    @Autowired
    private CompanieAerianaRepository companieAerianaRepository;
    @Autowired
    private LocatieRepository locatieRepository;

    public Zbor mapZborRequestToZborDBObject(ZborRequest zborRequest) {
        return new Zbor(
                companieAerianaRepository.getCompanieAerianaIDByNume(zborRequest.getCompanieAeriana().getNumeCompanie()),
                zborRequest.getAvion().getAvionID(),
                locatieRepository.getLocatieIDByNumeAeroport(zborRequest.getLocatiePlecare().getNumeAeroport()),
                locatieRepository.getLocatieIDByNumeAeroport(zborRequest.getLocatieSosire().getNumeAeroport()),
                zborRequest.getTipZbor().ordinal(),
                zborRequest.getDataPlecare(),
                zborRequest.getDataSosire());
    }
}
