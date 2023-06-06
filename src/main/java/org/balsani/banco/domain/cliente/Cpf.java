package org.balsani.banco.domain.cliente;

public class Cpf {
    private String numero;

    public Cpf(String numero) {
        if(numero == null ||
        !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Cpf inválido");
        }
        this.numero = numero;
    }
}
