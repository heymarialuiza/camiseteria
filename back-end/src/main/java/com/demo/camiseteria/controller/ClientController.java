package com.demo.camiseteria.controller;

import com.demo.camiseteria.model.entity.ClientEntity;
import com.demo.camiseteria.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private final ClientService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClientEntity> getAll() {
        return service.listAll();
    }

    @PostMapping("/register")
    public void register(@RequestBody ClientEntity client) {
        service.register(client);
    }
}