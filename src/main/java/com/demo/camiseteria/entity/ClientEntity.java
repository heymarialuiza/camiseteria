package com.demo.camiseteria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "clients")
@Entity(name = "clients")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long cpfCnpj;

    private String endereco;

    private String email;

    private Long telefone;

    private String tamanho;

    private String redeSocial;
}
