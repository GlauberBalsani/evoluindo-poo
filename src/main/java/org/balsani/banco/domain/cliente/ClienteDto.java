package org.balsani.banco.domain.cliente;

public class ClienteDto {
    private String nomeCliente;
    private String cpfCliente;
    private String emailCliente;

    public ClienteDto(String nomeCliente, String cpfCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
    }

    public Cliente criarCliente() {
        return new Cliente(
                new Cpf(cpfCliente),
                nomeCliente,
                new Email(emailCliente)
        );
    }
}
