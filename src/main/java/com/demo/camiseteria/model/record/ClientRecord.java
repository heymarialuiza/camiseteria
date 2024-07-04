package com.demo.camiseteria.model.record;

public record ClientRecord(
        Long id_client,
        String nome,
        Long cpfCnpj,
        String endereco,
        String email,
        Long telefone,
        String tamanho,
        String redeSocial) {
}
