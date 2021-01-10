package com.example.demo.mapper;

import com.example.demo.models.Zbor;
import com.example.demo.repository.CompanieAerianaRepository;
import com.example.demo.repository.LocatieRepository;
import com.example.demo.request_templates.ZborRequest;

public class ZborRequestToZborMapper {
    public static Zbor mapZborRequestToZborDBObject(ZborRequest zborRequest) {
        return new Zbor(
                new CompanieAerianaRepository().getCompanieAerianaIDByNume(zborRequest.getCompanieAeriana().getNumeCompanie()),
                zborRequest.getAvion().getAvionID(),
                LocatieRepository.getLocatieIDByNumeAeroport(zborRequest.getLocatiePlecare().getNumeAeroport()),
                LocatieRepository.getLocatieIDByNumeAeroport(zborRequest.getLocatieSosire().getNumeAeroport()),
                zborRequest.getTipZbor().ordinal(),
                zborRequest.getDataPlecare(),
                zborRequest.getDataSosire());
    }
}
