package com.devlucasvargas.sistema_lanchonete.dto;

import com.devlucasvargas.sistema_lanchonete.enums.StatusEnums;
import com.devlucasvargas.sistema_lanchonete.models.ClienteModel;

import java.time.LocalDate;

public record PedidoDto(
        String nome,
        String descricao,
        Double preco,
        Integer quantidadeEstoque,
        Boolean ativo,
        ClienteModel clienteModel,
        LocalDate dataPedido,
        StatusEnums statusEnums,
        Double valorTotal
) {
}
