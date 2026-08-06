package com.devlucasvargas.sistema_lanchonete.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_item_pedido")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemPedidoModel {

    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private PedidoModel pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoModel produto;

    private Integer quantidade;
    private Double precoUnitario;
    private Double subTotal;

}
