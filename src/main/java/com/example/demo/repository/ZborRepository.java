package com.example.demo.repository;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.models.Zbor;
import com.example.demo.utils.TipZbor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import com.example.demo.queries.ZborQueries;

@Repository
public class ZborRepository {
    @Autowired
    private JdbcTemplate zborJdbcTemplate;
    @Autowired
    private AvionRepository avionRepository;
    @Autowired
    private CompanieAerianaRepository companieAerianaRepository;


    //private List<Zbor> listaZboruri = new ArrayList<>();

    public List<Zbor> getAllZboruri() {
        return zborJdbcTemplate.query(ZborQueries.SELECT_ALL_ZBORURI, new BeanPropertyRowMapper<>(Zbor.class));
    }

    public void adaugaZbor(String companieAeriana, int avionID, String locatiePlecareNume, String locatieSosireNume,
                           TipZbor tipZbor, Date dataPlecare, Date dataSosire) {
        int companieID = companieAerianaRepository.getCompanieAerianaIDByNume(companieAeriana);
//        zborJdbcTemplate.update(ZborQueries.ADD_ZBOR, companieID, avionID, locatiePlecareID, locatieSosireID, )
        //zborJdbcTemplate.query(ZborQueries.ADD_ZBOR, //ceva)
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