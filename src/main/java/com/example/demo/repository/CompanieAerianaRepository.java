package com.example.demo.repository;

import com.example.demo.models.CompanieAeriana;
import com.example.demo.queries.CompanieAerianaQueries;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Types;
import java.util.List;

@Repository
public class CompanieAerianaRepository {
    private static JdbcTemplate companieAerianaJdbcTemplate;

    public List<CompanieAeriana> getAllCompaniiAeriene() {
        return companieAerianaJdbcTemplate.query(CompanieAerianaQueries.SELECT_ALL_COMPANII, new BeanPropertyRowMapper<>(CompanieAeriana.class));
    }

    public static int getCompanieAerianaIDByNume(String nume) {
        return companieAerianaJdbcTemplate.queryForObject(
                CompanieAerianaQueries.SELECT_COMPANIE_BY_NAME,
                new Object[]{nume},
                new int[]{Types.VARCHAR},
                Integer.class);

    }
}
