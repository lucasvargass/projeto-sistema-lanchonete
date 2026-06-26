package com.devlucasvargas.sistema_lanchonete.service;

import com.devlucasvargas.sistema_lanchonete.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
}
