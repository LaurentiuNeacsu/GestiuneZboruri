package com.example.demo.repository;

import com.example.demo.models.Avion;
import com.example.demo.queries.AvionQueries;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Types;
import java.util.List;

@Repository
public class AvionRepository {
    private static JdbcTemplate avionJdbcTemplate;

    public List<Avion> getAvioaneByNameAndCompany(String avionNume, String companieNume) {
        return avionJdbcTemplate.query(
                AvionQueries.SELECT_AVIOANE_BY_NAME_AND_COMPANY,
                new Object[]{companieNume, avionNume},
                new int[]{Types.VARCHAR, Types.VARCHAR},
                new BeanPropertyRowMapper<>(Avion.class));
    }
}
