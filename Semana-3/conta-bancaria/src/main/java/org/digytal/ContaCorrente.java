package org.digytal;

import exception.ContaException;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    private Double saldo = 0.0;
    private Integer numeroConta;
    private Integer numeroAgencia;
    private String nomeCliente;
    private LocalDate data;
    private Boolean cancelada;
    private List<Operacao> operacoes;

    public ContaCorrente(Integer numeroConta, Integer numeroAgencia, String nomeCliente, LocalDate data){
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
      if(destino == null){
          throw new IllegalArgumentException("A conta destino não pode ser nula");
      }
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

        //expressão lambda
        return operacoes
                // stream: permite percorrer uma lista de forma declarativa
                .stream()
                //filter: filtrar os resultados que eu estou aguardando| Ex: extrato da data inicial ate a data final
                .filter( element -> element.getData().isAfter(dataInicial) && element.getData().isBefore(dataFinal))
                //toList: retorna uma nova lista com novos valores
                .toList();
    }


}
