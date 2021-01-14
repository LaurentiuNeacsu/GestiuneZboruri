package com.example.demo.repository;

import com.example.demo.models.Rezervare;
import com.example.demo.queries.RezervareQueries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class RezervareRepository {
    @Autowired
    private JdbcTemplate rezervareJdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(RezervareRepository.class);
    private final RowMapper<Rezervare> mapper = (resultSet, rowNum) ->
            new Rezervare(resultSet.getLong("rezervareID"),
                          resultSet.getLong("zborID"),
                          resultSet.getLong("clientID"),
                          resultSet.getDouble("pret"));

    public List<Rezervare> getRezervareByClientNume(String nume) {
        return rezervareJdbcTemplate.query(
                RezervareQueries.SELECT_REZERVARE_BY_CLIENT_NUME,
                new Object[] { nume },
                new int[] { Types.VARCHAR },
                mapper);
    }

    public void addRezervare(Rezervare rezervare) {
        rezervareJdbcTemplate.update(
                RezervareQueries.INSERT_REZERVARE,
                rezervare.getZborID(),
                rezervare.getClientID(),
                rezervare.getPret());
        String mesaj = "A fost adaugata rezervarea reprezentata de obiectul: " + rezervare.toString();
        LocalDateTime timestamp = LocalDateTime.now();
        logger.info(mesaj + " " + timestamp);
        rezervareJdbcTemplate.update("INSERT INTO tblaudit(mesaj, timestamp) VALUES (?, ?)", mesaj, timestamp);
    }

    public void deleteRezervareByID(Long id) {
        rezervareJdbcTemplate.update(RezervareQueries.DELETE_REZERVARE_BY_ID, id);
        String mesaj = "A fost stearsa rezervarea cu ID-ul: " + id;
        LocalDateTime timestamp = LocalDateTime.now();
        logger.info(mesaj + " " + timestamp);
        rezervareJdbcTemplate.update("INSERT INTO tblaudit(mesaj, timestamp) VALUES (?, ?)", mesaj, timestamp);
    }
}