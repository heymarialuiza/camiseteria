package com.demo.camiseteria.service;

import com.demo.camiseteria.model.entity.MembersEntity;
import com.demo.camiseteria.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersService {

    @Autowired
    private MembersRepository repository;

    public List<MembersEntity> listAll() {
        return repository.findAll();
    }

    public MembersEntity register(MembersEntity client) {
        return repository.save(client);
    }

//    public ClientEntity update(ClientEntity client) {
//        return repository.
//    }
}