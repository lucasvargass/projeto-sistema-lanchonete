package com.devlucasvargas.sistema_lanchonete.service;

import com.devlucasvargas.sistema_lanchonete.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
}
