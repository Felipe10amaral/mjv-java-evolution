package org.digytal;

import exception.ContaException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    private Double saldo = 0.0;
    private Integer numeroConta;
    private Integer numeroAgencia;

    private LocalDate data;

    private Cliente cliente;
    private Boolean cancelada;
    private List<Operacao> operacoes = new ArrayList<Operacao>();

    public ContaCorrente() {
        cancelada = false;

    }
    public ContaCorrente(Integer numeroConta, Integer numeroAgencia, LocalDate data){
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;

        cancelada = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor)  {
        validarDeposito(valor);
        saldo += valor;
        operacoes.add(new Operacao("deposito", valor));
    }
    public Double sacar(Double valor) {
        validarSaque(valor);
        saldo -= valor;
        operacoes.add(new Operacao("saque", valor));
        return saldo;
    }

    public void transferir(Double valor, ContaCorrente destino) {
      if(destino == null){
          throw new IllegalArgumentException("A conta destino não pode ser nula");
      }
      validarSaque(valor);
      sacar(valor);
      destino.depositar(valor);
      operacoes.add(new Operacao("transferencia", valor));
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

    private void validarConta() {
        if(cancelada){
            throw new IllegalArgumentException("Conta inativa");
        }
    }

    public List<Operacao> consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {
        validarConta();
        if(dataInicial == null || dataFinal == null) {
            throw new IllegalArgumentException("Data inicial ou data final inválida");
        }

        if(dataInicial.isAfter(dataFinal)){ //isAfter verifica se a data inicial e posterior a data final
            throw new IllegalArgumentException("Data inicial não pode ser posterior a data final");
        }


        return operacoes;

    }


}
