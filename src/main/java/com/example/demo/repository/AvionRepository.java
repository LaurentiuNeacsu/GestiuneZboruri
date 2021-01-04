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
    private JdbcTemplate avionJdbcTemplate;

    public List<Avion> getAvioaneByCompany(String companieNume) {
        return avionJdbcTemplate.query(
                AvionQueries.SELECT_AVIOANE_BY_COMPANY,
                new Object[]{companieNume},
                new int[]{Types.INTEGER},
                new BeanPropertyRowMapper<>(Avion.class));
    }
}
