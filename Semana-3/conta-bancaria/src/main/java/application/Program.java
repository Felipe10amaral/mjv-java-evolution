package application;

import arquivo.MovimentoArquivoGerador;
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

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Tamires");
        cliente1.setCpf("456.456.456-00");

        ContaCorrente contaFelipe = new ContaCorrente();
        contaFelipe.setNumeroAgencia(012);
        contaFelipe.setNumeroConta(123);
        contaFelipe.setCliente(cliente);

        ContaCorrente contaTamires = new ContaCorrente();
        contaTamires.setNumeroAgencia(012);
        contaTamires.setNumeroConta(124);
        contaTamires.setCliente(cliente1);

        contaTamires.depositar(500.0);
        contaTamires.sacar(85.0);
        contaTamires.transferir(47.0, contaFelipe);

        contaFelipe.depositar(50.0);
        contaFelipe.sacar(30.0);


        List<Operacao> movimentos = contaFelipe.consultarExtrato(LocalDate.now(), LocalDate.now());
        contaFelipe.depositar(100.0);

        MovimentoArquivoGerador mg = new MovimentoArquivoGerador();
        mg.gerarArquivoPosicional(contaTamires);


    }
}
