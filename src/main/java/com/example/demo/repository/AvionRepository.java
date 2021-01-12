package com.example.demo.repository;

import com.example.demo.models.Avion;
import com.example.demo.queries.AvionQueries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.Types;
import java.util.List;

@Repository
public class AvionRepository {
    @Autowired
    private JdbcTemplate avionJdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(AvionRepository.class);
    private final RowMapper<Avion> mapper = (resultSet, rowNum) ->
            new Avion(resultSet.getLong("avionID"),
                      resultSet.getString("nume"),
                      resultSet.getInt("capacitate"),
                      resultSet.getLong("companieID"),
                      resultSet.getBoolean("areCursa"));

    public List<Avion> getAvioaneByCompanyAndAvailability(String companieNume) {
        return avionJdbcTemplate.query(
                AvionQueries.SELECT_AVIOANE_BY_COMPANY_AND_AVAILABILITY,
                new Object[] { companieNume },
                new int[] { Types.VARCHAR },
                mapper);
    }

    public void addAvion(Avion avion) {
        avionJdbcTemplate.update(
                AvionQueries.INSERT_AVION,
                avion.getNume(),
                avion.getCapacitate(),
                avion.getCompanieID(),
                avion.getAreCursa());
        logger.info("A fost adaugat avionul reprezentat de obiectul: " + avion.toString());
    }
}
