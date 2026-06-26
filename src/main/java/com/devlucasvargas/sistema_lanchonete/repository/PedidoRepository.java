package com.devlucasvargas.sistema_lanchonete.repository;

import com.devlucasvargas.sistema_lanchonete.models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
