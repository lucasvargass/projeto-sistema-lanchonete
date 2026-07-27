package com.devlucasvargas.sistema_lanchonete.models.dto.response;

import com.devlucasvargas.sistema_lanchonete.models.ClienteModel;

public class ClienteResponseDTO {

    private String nome;
    private String telefone;
    private String email;
    private Boolean ativo;

    public ClienteResponseDTO(ClienteModel clienteModel) {
        this.nome = clienteModel.getNome();
        this.telefone = clienteModel.getTelefone();
        this.email = clienteModel.getEmail();
        this.ativo = clienteModel.getAtivo();
    }
}
