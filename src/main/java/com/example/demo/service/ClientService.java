package com.example.demo.service;

import com.example.demo.models.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClienti() {
        return clientRepository.getAllClienti();
    }

    public void addClient(Client client) {
        clientRepository.addClient(client);
    }

    public Client getClientByID(Long id) {
        return clientRepository.getClientByID(id);
    }

    public List<Client> getClientByNume(String nume) {
        return clientRepository.getClientByNume(nume);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteClient(id);
    }
}
