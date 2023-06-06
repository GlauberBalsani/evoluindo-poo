package org.balsani.banco.services;

import org.balsani.banco.domain.cliente.Cliente;
import org.balsani.banco.domain.cliente.ClienteDto;
import org.balsani.banco.domain.repository.ClienteRepository;

public class CadastrarCliente {
    private final ClienteRepository repository;

    public CadastrarCliente(ClienteRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(ClienteDto dados) {
        Cliente cliente = dados.criarCliente();
        repository.cadastrarCliente(cliente);
    }
}
