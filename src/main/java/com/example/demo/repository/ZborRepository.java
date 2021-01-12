package com.example.demo.repository;

import com.example.demo.models.*;
import com.example.demo.queries.AvionQueries;
import com.example.demo.request_templates.ZborRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;
import com.example.demo.queries.ZborQueries;

@Repository
public class ZborRepository {
    @Autowired
    private JdbcTemplate zborJdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(ZborRepository.class);
    private final RowMapper<ZborRequest> mapper = (resultSet, rowNum) ->
            new ZborRequest(new CompanieAeriana(resultSet.getLong("companieID"),
                                                resultSet.getString("numeCompanie")),
                            new Avion(resultSet.getLong("avionID"),
                                      resultSet.getString("nume"),
                                      resultSet.getInt("capacitate"),
                                      resultSet.getLong("companieID"),
                                      resultSet.getBoolean("areCursa")),
                            new Locatie(resultSet.getString("numeAeroportPlecare"),
                                        resultSet.getString("orasPlecare"),
                                        resultSet.getString("taraPlecare")),
                            new Locatie(resultSet.getString("numeAeroportSosire"),
                                        resultSet.getString("orasSosire"),
                                        resultSet.getString("taraSosire")),
                            resultSet.getObject("dataPlecare", LocalDateTime.class),
                            resultSet.getObject("dataSosire", LocalDateTime.class));

    public List<ZborRequest> getAllZboruri() {
        return zborJdbcTemplate.query(ZborQueries.SELECT_ALL_ZBORURI, mapper);
    }

    public void addZbor(Zbor zbor) {
        zborJdbcTemplate.update(ZborQueries.INSERT_ZBOR,
                zbor.getCompanieAerianaID(),
                zbor.getAvionID(),
                zbor.getLocatiePlecareID(),
                zbor.getLocatieSosireID(),
                zbor.getDataPlecare(),
                zbor.getDataSosire());
        zborJdbcTemplate.update(AvionQueries.UPDATE_AVION_AVAILABILITY, zbor.getAvionID());
        logger.info("A fost adaugat zborul reprezentat de obiectul: " + zbor.toString() + " si a fost setata cursa pentru avionul " + zbor.getAvionID());
    }

    public void modificaZbor(int id) {

    }

    public Zbor getZborByID(Long id) {
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