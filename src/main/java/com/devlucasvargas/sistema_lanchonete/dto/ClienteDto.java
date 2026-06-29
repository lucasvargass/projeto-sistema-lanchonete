package com.devlucasvargas.sistema_lanchonete.dto;

public record ClienteDto(
        String nome,
        String telefone,
        String email,
        Boolean ativo
) {
}
