package org.digytal;

import exception.ContaException;

import java.util.Date;

public class ContaCorrente {
    private Double saldo = 0.0;
    private Integer numeroConta;
    private Integer numeroAgencia;
    private String nomeCliente;
    private Date data;
    private Boolean cancelada;

    public ContaCorrente(Integer numeroConta, Integer numeroAgencia, String nomeCliente){
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        cancelada = false;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor)  {
        validarDeposito(valor);
        saldo += valor;
    }
    public Double sacar(Double valor) {
        validarSaque(valor);
        saldo -= valor;
        return saldo;
    }

    public void transferir(Double valor, ContaCorrente destino) {
      validarSaque(valor);
      sacar(valor);
      destino.depositar(valor);
    }

    public boolean cancelar(String justificativa) {
        validarCancelamento(justificativa);
        return cancelada = true;
    }

    private void validarSaque(Double valor){
        if(valor > saldo ){
            throw new ContaException("Saldo insuficiente para esta transação");
        }
        if(valor <= 0){
            throw new ContaException("O valor de saque não pode ser menor ou igual a 0");
        }
    }

    private void validarDeposito( Double valor) {
        if(valor <= 0){
            throw new ContaException("O valor de depósito deve ser superior a zero");
        }

        if(valor == null ) {
            throw new ContaException("O valor não pode ser nulo");
        }
    }

    private void validarCancelamento(String justificativa){
        if(justificativa.trim().isEmpty()){
            throw new ContaException("A justificativa necessita ser informada");
        }
    }

}
