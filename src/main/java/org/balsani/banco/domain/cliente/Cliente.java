package org.balsani.banco.domain.cliente;

import org.balsani.banco.domain.conta.Conta;

public class Cliente {
    private Cpf cpf;
    private String nome;
    private Email email;

    private Conta conta;

    public Cliente(Cpf cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;

    }

    public Cpf getCpf() {
        return cpf;
    }
}
