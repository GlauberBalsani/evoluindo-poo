package org.balsani.banco.domain.repository;

import org.balsani.banco.domain.cliente.Cliente;
import org.balsani.banco.domain.cliente.Cpf;

import java.util.List;

public interface ClienteRepository {
    void cadastrarCliente(Cliente cliente);
    Cliente buscarPorCpf(Cpf cpf);
    List<Cliente> listarClientes();
}
