package org.balsani.banco.services;

import org.balsani.banco.domain.cliente.Cliente;
import org.balsani.banco.domain.cliente.ClienteDto;
import org.balsani.banco.domain.cliente.Cpf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarClienteTest {

    @Test
    void clienteDeveriaSerPersistido() {
        ClienteRepositoryEmMemoria repositoryEmMemoria =
                new ClienteRepositoryEmMemoria();
        CadastrarCliente useCase =
                new CadastrarCliente(new ClienteRepositoryEmMemoria());

        ClienteDto dto =
                new ClienteDto("Fulano",
                        "123.456.789-00",
                        "fulano@gmail.com");

        useCase.cadastrar(dto);

        
        Cliente cliente =
                repositoryEmMemoria.buscarPorCpf(new Cpf("123.456.789-00"));

        assertEquals("Fulano", cliente.getNome());
        assertEquals("123.456.789-00", cliente.getNome());
        assertEquals("Fulano", cliente.getNome());

    }



}