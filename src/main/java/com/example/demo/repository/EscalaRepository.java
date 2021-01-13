package com.example.demo.repository;

import com.example.demo.models.Escala;
import com.example.demo.models.Locatie;
import com.example.demo.queries.EscalaQueries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.Types;
import java.util.List;

@Repository
public class EscalaRepository {
    @Autowired
    private JdbcTemplate escalaJdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(EscalaRepository.class);
    private final RowMapper<Escala> mapper = (resultSet, rowNum) ->
            new Escala(resultSet.getLong("escalaID"),
                       resultSet.getLong("zborID"),
                       new Locatie(resultSet.getLong("locatieID"),
                                   resultSet.getString("numeAeroport"),
                                   resultSet.getString("oras"),
                                   resultSet.getString("tara")));

    public List<Escala> getEscalaByZborID(Long id) {
        return escalaJdbcTemplate.query(EscalaQueries.SELECT_ESCALA_BY_ZBOR, new Object[] { id }, new int[] {Types.INTEGER }, mapper);
    }

    public void addEscala(Escala escala) {
        escalaJdbcTemplate.update(EscalaQueries.INSERT_ESCALA, escala.getZborID(), escala.getLocatie().getLocatieID());
        logger.info("A fost adaugata escala reprezentata de obiectul: " + escala.toString());
    }
}