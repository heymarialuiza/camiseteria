package com.demo.camiseteria.service;

import com.demo.camiseteria.entity.ClientEntity;
import com.demo.camiseteria.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository repository;

    public List<ClientEntity> listAll() {
        return repository.findAll();
    }
}
