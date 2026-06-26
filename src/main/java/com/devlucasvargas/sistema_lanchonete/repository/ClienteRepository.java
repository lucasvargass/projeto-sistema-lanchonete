package com.devlucasvargas.sistema_lanchonete.repository;

import com.devlucasvargas.sistema_lanchonete.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
