package com.devlucasvargas.sistema_lanchonete.controller;

import com.devlucasvargas.sistema_lanchonete.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;
}
