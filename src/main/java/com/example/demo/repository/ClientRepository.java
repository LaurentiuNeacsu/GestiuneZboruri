package com.example.demo.repository;

import com.example.demo.models.Client;
import com.example.demo.queries.ClientQueries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.Types;
import java.util.List;

@Repository
public class ClientRepository {
    @Autowired
    private JdbcTemplate clientJdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(ClientRepository.class);
    private final RowMapper<Client> mapper = (resultSet, rowNum) ->
            new Client(resultSet.getLong("clientID"),
                       resultSet.getString("nume"),
                       resultSet.getString("prenume"),
                       resultSet.getString("cnp"));

    public List<Client> getAllClienti() {
        return clientJdbcTemplate.query(ClientQueries.SELECT_ALL_CLIENTI, mapper);
    }

    public void addClient(Client client) {
        clientJdbcTemplate.update(ClientQueries.INSERT_CLIENT,
                client.getNume(),
                client.getPrenume(),
                client.getCnp());
        logger.info("A fost adaugat clientul reprezentat de obiectul: " + client.toString());
    }

    public Client getClientByID(Long id) {
        return clientJdbcTemplate.queryForObject(
                ClientQueries.SELECT_CLIENT_BY_ID,
                new Object[]{id},
                new int[]{Types.INTEGER},
                mapper);
    }

    public Client getClientByNume(String nume) {
        return clientJdbcTemplate.queryForObject(
                ClientQueries.SELECT_CLIENT_BY_NUME,
                new Object[]{nume},
                new int[]{Types.VARCHAR},
                mapper);
    }
}