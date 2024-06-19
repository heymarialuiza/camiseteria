package com.demo.camiseteria.controller;

import com.demo.camiseteria.entity.ClientEntity;
import com.demo.camiseteria.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private final ClientService service;

    @GetMapping
    public List<ClientEntity> getAll() {

        return service.listAll();

    }
}
