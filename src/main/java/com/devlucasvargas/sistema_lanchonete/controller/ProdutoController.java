package com.devlucasvargas.sistema_lanchonete.controller;

import com.devlucasvargas.sistema_lanchonete.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pedido")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;
}
