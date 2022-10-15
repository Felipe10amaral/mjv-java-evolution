package application;

import org.digytal.Cliente;
import org.digytal.ContaCorrente;
import org.digytal.Operacao;

import java.time.LocalDate;
import java.util.List;

public class Program {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setCpf("123.123.123-00");
        cliente.setNome("Felipe Peixoto do Amaral");
        ContaCorrente contaFelipe = new ContaCorrente();
        contaFelipe.setNumeroAgencia(012);
        contaFelipe.setNumeroConta(123);
        contaFelipe.setCliente(cliente);
        contaFelipe.depositar(200.0);
        contaFelipe.sacar(30.0);
        System.out.println(contaFelipe.getSaldo());

        List<Operacao> movimentos = contaFelipe.consultarExtrato(LocalDate.now(), LocalDate.now());
    }
}
