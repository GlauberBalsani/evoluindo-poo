package org.balsani.banco.services;

import org.balsani.banco.domain.cliente.Cliente;
import org.balsani.banco.domain.cliente.Cpf;
import org.balsani.banco.domain.exceptions.BusinessException;
import org.balsani.banco.domain.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryEmMemoria implements ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();
    @Override
    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    @Override
    public Cliente buscarPorCpf(Cpf cpf) {
        return this.clientes.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new BusinessException("Cliente não encontrado"));
    }

    @Override
    public List<Cliente> listarClientes() {
        return this.clientes;
    }
}
