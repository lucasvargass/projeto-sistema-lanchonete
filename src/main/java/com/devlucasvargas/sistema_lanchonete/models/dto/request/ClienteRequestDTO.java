package com.devlucasvargas.sistema_lanchonete.models.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteRequestDTO{
        
        @NotBlank(message = "O campo é obrigatório!")
        private String nome;

        @NotBlank(message = "O campo é obrigatório!")
        private String telefone;
        private String email;
}
