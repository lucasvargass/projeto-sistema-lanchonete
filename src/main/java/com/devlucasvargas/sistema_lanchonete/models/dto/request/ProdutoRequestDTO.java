package com.devlucasvargas.sistema_lanchonete.models.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ProdutoRequestDTO {

    @NotBlank(message = "O campo é obrigatório!")
    private String nome;

    private String descricao;

    @Positive(message = "O preço deve ser um valor positivo!")
    private Double preco;

    @PositiveOrZero(message = "A quantidade em estoque não pode ser negativa!")
    private Integer quantidadeEstoque;
}
