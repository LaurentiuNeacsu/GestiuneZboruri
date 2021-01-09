package com.example.demo.repository;

import com.example.demo.queries.LocatieQueries;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.Types;

public class LocatieRepository {
    private static JdbcTemplate locatieJdbcTemplate;

    public static int getLocatieIDByNumeAeroport(String nume) {
        return locatieJdbcTemplate.queryForObject(
                LocatieQueries.SELECT_LOCATIE_BY_AIRPORTNAME,
                new Object[]{nume},
                new int[]{Types.VARCHAR},
                Integer.class);
    }
}
