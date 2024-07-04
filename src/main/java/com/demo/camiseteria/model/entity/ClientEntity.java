package com.demo.camiseteria.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "client")
@Entity(name = "client")
@Getter
@Setter
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(name = "client_seq", sequenceName = "client_id_seq", allocationSize = 1)
    private Long id_client;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpfCnpj", nullable = false)
    private Long cpfCnpj;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telefone", nullable = false)
    private Long telefone;

    @Column(name = "tamanho")
    private String tamanho;

    @Column(name = "redeSocial")
    private String redeSocial;
}
