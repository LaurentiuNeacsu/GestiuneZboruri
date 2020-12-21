package com.example.demo.repository;

import com.example.demo.models.Zbor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ZborRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private List<Zbor> listaZboruri = new ArrayList<>();

    public List<Zbor> getAllZboruri() {
        return listaZboruri;
    }

    public void adaugaZbor(Zbor zbor) {
        listaZboruri.add(zbor);
    }

    public void modificaZbor(int id) {

    }

    public Zbor vizualizeazaZbor(int id) {
        return new Zbor();
    }

    public Zbor vizualizeazaZborDupaLocatiePlecare(String locatie) {
        return new Zbor();
    }

    public Zbor vizualizeazaZborDupaLocatieSosire(String locatie) {
        return new Zbor();
    }

    public Zbor stergeZbor(int id) {
        return listaZboruri.stream()
                .filter(zbor -> zbor.getZborID() == 1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nu exista acest zbor ba!"));
    }
}