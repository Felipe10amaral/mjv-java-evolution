import org.digytal.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaBancariaTeste {

    @DisplayName("Testando método deposito")
    @Test
    void testarDeposito() {
        Double expectativa = 60.00;
        ContaCorrente contaFelipe = new ContaCorrente(1, 1, "Felipe");
        contaFelipe.depositar(60.00);
        Double resultado = contaFelipe.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

    @DisplayName("Testando método deposito com valor abaixo de 0")
    @Test
    void testarDepositoValorNegativo() {
        Double expectativa = -10.00;
        ContaCorrente contaFelipe = new ContaCorrente(1, 1, "Felipe");
        contaFelipe.depositar(-10.0);
        Double resultado = contaFelipe.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

    @DisplayName("Testando método de saque")
    @Test
    void testarSaque() {
        Double expectativa = 20.0;
        ContaCorrente contaFelipe = new ContaCorrente(1, 1, "Felipe");
        contaFelipe.depositar(30.0);
        contaFelipe.sacar(10.0);
        Double resultado = contaFelipe.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

    @DisplayName("Testando o metodo de transferencia")
    @Test
    void testarTransferencia() {
        ContaCorrente contaFelipe = new ContaCorrente(1, 1, "Felipe");
        ContaCorrente contaTamires = new ContaCorrente(2, 1, "Tamires");
        contaFelipe.depositar(100.00);
        Double expectativa = 30.00;
        contaFelipe.transferir(30.00, contaTamires);
        Double resultado = contaTamires.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

    @DisplayName("Testando o metodo de cancelar a conta sem a justificativa")
    @Test
    void testarCancelarConta() {
        ContaCorrente contaFelipe = new ContaCorrente(1,1,"Felipe");
        Boolean expectativa = contaFelipe.cancelar("g ");
        Assertions.assertTrue(expectativa);
    }



}
