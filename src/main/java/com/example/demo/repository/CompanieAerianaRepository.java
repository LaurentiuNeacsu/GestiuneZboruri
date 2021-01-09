package com.example.demo.repository;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.queries.CompanieAerianaQueries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Types;
import java.util.List;

@Repository
public class CompanieAerianaRepository {
    @Autowired
    private JdbcTemplate companieAerianaJdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(CompanieAerianaRepository.class);

    public List<CompanieAeriana> getAllCompaniiAeriene() {
        return companieAerianaJdbcTemplate.query(CompanieAerianaQueries.SELECT_ALL_COMPANII, new BeanPropertyRowMapper<>(CompanieAeriana.class));
    }

    public static int getCompanieAerianaIDByNume(String nume) {
//        return companieAerianaJdbcTemplate.queryForObject(
//                CompanieAerianaQueries.SELECT_COMPANIEID_BY_NAME,
//                new Object[]{nume},
//                new int[]{Types.VARCHAR},
//                Integer.class);
        return 0;
    }

    public void adaugaCompanieAeriana(CompanieAeriana companieAeriana) {
        companieAerianaJdbcTemplate.update(CompanieAerianaQueries.INSERT_COMPANIE, companieAeriana.getNumeCompanie());
        logger.info("A fost adaugata compania reprezentata de obiectul: " + companieAeriana.toString());
    }

    public CompanieAeriana vizualizareCompanieAerianaByID(Long id) {
        return companieAerianaJdbcTemplate.queryForObject(
                CompanieAerianaQueries.SELECT_COMPANIE_BY_ID,
                new Object[]{id},
                new int[]{Types.INTEGER},
                CompanieAeriana.class);
    }
}