package com.example.demo.repository;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.queries.CompanieAerianaQueries;
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
public class CompanieAerianaRepository {
    @Autowired
    private JdbcTemplate companieAerianaJdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(CompanieAerianaRepository.class);
    private final RowMapper<CompanieAeriana> mapper = (resultSet, rowNum) ->
            new CompanieAeriana(resultSet.getLong("companieID"),
                                resultSet.getString("numeCompanie"));

    public CompanieAerianaRepository() {
    }

    public List<CompanieAeriana> getAllCompaniiAeriene() {
        return companieAerianaJdbcTemplate.query(CompanieAerianaQueries.SELECT_ALL_COMPANII, mapper);
    }

    public long getCompanieAerianaIDByNume(String nume) {
        return companieAerianaJdbcTemplate.queryForObject(
                CompanieAerianaQueries.SELECT_COMPANIEID_BY_NAME,
                new Object[]{nume}, new int[]{Types.VARCHAR},
                Long.class);
    }

    public void addCompanieAeriana(CompanieAeriana companieAeriana) {
        companieAerianaJdbcTemplate.update(CompanieAerianaQueries.INSERT_COMPANIE, companieAeriana.getNumeCompanie());
        String mesaj = "A fost adaugata compania reprezentata de obiectul:  " + companieAeriana.toString();
        LocalDateTime timestamp = LocalDateTime.now();
        logger.info(mesaj + " " + timestamp);
        companieAerianaJdbcTemplate.update("INSERT INTO tblaudit(mesaj, timestamp) VALUES (?, ?)", mesaj, timestamp);
    }

    public CompanieAeriana getCompanieAerianaByID(Long id) {
        return companieAerianaJdbcTemplate.queryForObject(
                CompanieAerianaQueries.SELECT_COMPANIE_BY_ID,
                new Object[]{id},
                new int[]{Types.INTEGER},
                mapper);
    }

    public void deleteCompanieAerianaByID(Long id) {
        companieAerianaJdbcTemplate.update(CompanieAerianaQueries.DELETE_COMPANIE_BY_ID, id);
        String mesaj = "A fost stearsa compania cu ID-ul " + id;
        LocalDateTime timestamp = LocalDateTime.now();
        logger.info(mesaj + " " + timestamp);
        companieAerianaJdbcTemplate.update("INSERT INTO tblaudit(mesaj, timestamp) VALUES (?, ?)", mesaj, timestamp);
    }
}