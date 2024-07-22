package com.demo.camiseteria.service;

import com.demo.camiseteria.model.entity.ClientEntity;
import com.demo.camiseteria.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<ClientEntity> listAll() {
        return repository.findAll();
    }

    public ClientEntity register(ClientEntity client) {
        return repository.save(client);
    }

    public ClientEntity update(ClientEntity client) {
        return repository.
    }
}