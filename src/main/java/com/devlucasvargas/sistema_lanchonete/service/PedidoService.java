package com.devlucasvargas.sistema_lanchonete.service;

import com.devlucasvargas.sistema_lanchonete.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepository;
}
