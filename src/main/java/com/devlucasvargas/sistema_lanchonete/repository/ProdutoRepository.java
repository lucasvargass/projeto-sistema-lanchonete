package com.devlucasvargas.sistema_lanchonete.repository;

import com.devlucasvargas.sistema_lanchonete.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
