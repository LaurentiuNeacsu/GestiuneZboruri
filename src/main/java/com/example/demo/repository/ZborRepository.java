package com.example.demo.repository;

import com.example.demo.models.Zbor;
import com.example.demo.utils.TipZbor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import com.example.demo.queries.ZborQueries;

@Repository
public class ZborRepository {
    private static final Logger logger = LoggerFactory.getLogger(ZborRepository.class);

    @Autowired
    private JdbcTemplate zborJdbcTemplate;

    public List<Zbor> getAllZboruri() {
        return zborJdbcTemplate.query(ZborQueries.SELECT_ALL_ZBORURI, new BeanPropertyRowMapper<>(Zbor.class));
    }

    public void adaugaZbor(Zbor zbor) {
        int companieID = CompanieAerianaRepository.getCompanieAerianaIDByNume(zbor.getCompanieAeriana().getNumeCompanie());
        int locatiePlecareID = LocatieRepository.getLocatieIDByNumeAeroport(zbor.getLocatiePlecare().getNumeAeroport());
        int locatieSosireID = LocatieRepository.getLocatieIDByNumeAeroport(zbor.getLocatieSosire().getNumeAeroport());
        //zborJdbcTemplate.update(ZborQueries.ADD_ZBOR, companieID, avionID, locatiePlecareID, locatieSosireID, tipZbor, dataPlecare, dataSosire);
        logger.info(zbor.toString());
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
//        return listaZboruri.stream()
//                .filter(zbor -> zbor.getZborID() == 1)
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("Nu exista acest zbor ba!"));
        return new Zbor();
    }
}