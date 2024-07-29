package com.demo.camiseteria.model.record;

public record MembersRecord(
        Long id_client,
        String name,
        Long cpfCnpj,
        String address,
        String email,
        Long phone,
        String size,
        String socialMedia) {
}