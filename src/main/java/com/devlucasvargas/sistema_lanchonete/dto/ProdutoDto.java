package com.devlucasvargas.sistema_lanchonete.dto;

public record ProdutoDto(
        String nome,
        String descricao,
        Double preco,
        Integer quantidadeEstoque,
        Boolean ativo
) {
}
