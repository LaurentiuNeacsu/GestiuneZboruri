package com.example.demo.controller;

import com.example.demo.models.Zbor;
import com.example.demo.service.ZborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/gestiune")
public class ZborController {
    @Autowired
    private ZborService service;

    @RequestMapping("/zboruri/get")
    public List<Zbor> getAllZboruri() {
        return service.getAllZboruri();
    }

    @RequestMapping("/zboruri/add")
    public void addZbor(Zbor zbor) {
        service.adaugaZbor(zbor);
    }

    @RequestMapping("/zboruri/editByID")
    public void editZbor(int zborID) {
        service.modificaZbor(zborID);
    }

    @RequestMapping("/zboruri/viewByID")
    public Zbor vizualizeazaZbor(int id) {
        return service.vizualizeazaZbor(id);
    }

    @RequestMapping("/zboruri/viewByLocatiePlecare")
    public Zbor vizualizeazaZborDupaLocatiePlecare(String locatie) {
        return service.vizualizeazaZborDupaLocatiePlecare(locatie);
    }

    @RequestMapping("/zboruri/viewByLocatieSosire")
    public Zbor vizualizeazaZborDupaLocatieSosire(String locatie) {
        return service.vizualizeazaZborDupaLocatieSosire(locatie);
    }
}
