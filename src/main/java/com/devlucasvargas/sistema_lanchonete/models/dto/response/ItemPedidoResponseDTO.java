package com.devlucasvargas.sistema_lanchonete.models.dto.response;

import com.devlucasvargas.sistema_lanchonete.models.ItemPedidoModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemPedidoResponseDTO {

    private Long ItemPedidoid;
    private String nomeProduto;
    private Integer quantidade;
    private Double precoUnitario;
    private Double subTotal;

    public ItemPedidoResponseDTO(ItemPedidoModel itemPedidoModel) {
        this.ItemPedidoid = itemPedidoModel.getId();
        this.nomeProduto = itemPedidoModel.getProduto().getNome();
        this.quantidade = itemPedidoModel.getQuantidade();
        this.precoUnitario = itemPedidoModel.getPrecoUnitario();
        this.subTotal = itemPedidoModel.getSubTotal();
    }


}
