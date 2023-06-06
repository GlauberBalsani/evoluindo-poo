package org.balsani.banco.domain.conta;

import java.math.BigDecimal;

public class Conta {
    private String numero;
    private String agencia;
    private BigDecimal saldo;

    public Conta(String numero, String agencia, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
