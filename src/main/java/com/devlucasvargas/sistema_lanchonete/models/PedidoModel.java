package com.devlucasvargas.sistema_lanchonete.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidadeEstoque;
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel clienteModel;

    private LocalDate dataPedido;
    private Double valorTotal;
}
