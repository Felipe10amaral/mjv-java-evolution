package org.digytal;

public class ContaCorrente {
    private Double saldo = 0.0;

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }
}
