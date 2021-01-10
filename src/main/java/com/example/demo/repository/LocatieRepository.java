package com.example.demo.repository;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.models.Locatie;
import com.example.demo.queries.LocatieQueries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.Types;
import java.util.List;

@Repository
public class LocatieRepository {
    @Autowired
    private JdbcTemplate locatieJdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(LocatieRepository.class);
    private final RowMapper<Locatie> mapper = (resultSet, rowNum) ->
            new Locatie(resultSet.getLong("locatieID"),
                        resultSet.getString("numeAeroport"),
                        resultSet.getString("oras"),
                        resultSet.getString("tara"));

    public List<Locatie> getAllLocatii() {
        return locatieJdbcTemplate.query(LocatieQueries.SELECT_ALL_LOCATII, mapper);
    }

    public int getLocatieIDByNumeAeroport(String nume) {
        return locatieJdbcTemplate.queryForObject(
                LocatieQueries.SELECT_LOCATIE_BY_AIRPORTNAME,
                new Object[]{nume},
                new int[]{Types.VARCHAR},
                Integer.class);
    }

    public void addLocatie(Locatie locatie) {
        locatieJdbcTemplate.update(
                LocatieQueries.INSERT_LOCATIE,
                locatie.getNumeAeroport(),
                locatie.getOras(),
                locatie.getTara());
        logger.info("A fost adaugata locatia reprezentata de obiectul: " + locatie.toString());
    }
}
