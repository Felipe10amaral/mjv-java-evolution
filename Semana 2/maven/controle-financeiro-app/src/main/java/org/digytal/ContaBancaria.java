package org.digytal;

public class ContaBancaria {
    private Double saldo = 0.0;

    public void depositar(Double saldo) {
        this.saldo += saldo;
    }

    public Double getSaldo(){
        return this.saldo;
    }

}
