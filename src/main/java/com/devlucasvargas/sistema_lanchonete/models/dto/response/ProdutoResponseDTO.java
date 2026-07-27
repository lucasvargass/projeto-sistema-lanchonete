package com.devlucasvargas.sistema_lanchonete.models.dto.response;

import com.devlucasvargas.sistema_lanchonete.models.ProdutoModel;

public class ProdutoResponseDTO {

    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidadeEstoque;

    public ProdutoResponseDTO(ProdutoModel produtoModel) {
        this.nome = produtoModel.getNome();
        this.descricao = produtoModel.getDescricao();
        this.preco = produtoModel.getPreco();
        this.quantidadeEstoque = produtoModel.getQuantidadeEstoque();
    }
}
