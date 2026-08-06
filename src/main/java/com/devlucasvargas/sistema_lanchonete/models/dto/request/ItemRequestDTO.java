package com.devlucasvargas.sistema_lanchonete.models.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemRequestDTO {

    @NotNull(message = "O campo ID do produto é obrigatório!")
    private Long produtoId;

    @NotNull(message = "A quantidade deve ser maior que zero!")
    private Integer quantidade;
}
