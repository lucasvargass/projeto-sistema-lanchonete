package com.devlucasvargas.sistema_lanchonete.repository;

import com.devlucasvargas.sistema_lanchonete.models.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, Long> {

    ItemPedidoModel findByIdPedidoId(Long itemId, Long pedidoId);
    List<ItemPedidoModel> findByPedidoId(Long pedidoId);
}
