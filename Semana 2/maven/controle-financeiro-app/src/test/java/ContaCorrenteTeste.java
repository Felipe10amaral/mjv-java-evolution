import org.digytal.ContaBancaria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTeste {

    @DisplayName("Testando método depositar da ContaCorrente")
    @Test
    void testDeposito() {
        Double expectativa = 60.00;
        ContaBancaria contaFelipe = new ContaBancaria();
        contaFelipe.depositar(60.00);
        Double resultado = contaFelipe.getSaldo();
        Assertions.assertEquals(expectativa, resultado);

    }
}
