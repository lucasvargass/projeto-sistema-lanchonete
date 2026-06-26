package com.devlucasvargas.sistema_lanchonete.service;

import com.devlucasvargas.sistema_lanchonete.models.ClienteModel;
import com.devlucasvargas.sistema_lanchonete.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Long salvarCliente(ClienteModel clienteModel){
        ClienteModel clienteSalvo = clienteRepository.save(clienteModel);
        return clienteSalvo.getId();
    }

    public List<ClienteModel> buscarTodosClientes(){
        return clienteRepository.findAll();
    }

    public ClienteModel buscarPorId(Long id){
        return clienteRepository.findById(id).orElseThrow(() ->
                new RuntimeException("O livro não foi encontrado!"));
    }

    public void editarCliente(Long id, ClienteModel clienteEditado){
        ClienteModel clienteBase = buscarPorId(id);
        clienteBase.setNome(clienteEditado.getNome());
        clienteBase.setEmail(clienteEditado.getEmail());
        clienteBase.setTelefone(clienteEditado.getTelefone());
        clienteBase.setAtivo(clienteEditado.getAtivo());
        clienteRepository.save(clienteBase);
    }

    public void excluirCliente(Long id){
        Optional<ClienteModel> clienteDeletado = clienteRepository.findById(id);
        if (clienteDeletado.isEmpty()){
            new RuntimeException("O cliente não foi encontrado!");
        }else{
            clienteRepository.deleteById(id);
        }
    }
}
