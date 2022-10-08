import org.digytal.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaBancariaTeste {

    @DisplayName("Testando método deposito")
    @Test
    void testarDeposito() {
        Double expectativa = 60.00;
        ContaCorrente contaFelipe = new ContaCorrente();
        contaFelipe.depositar(60.00);
        Double resultado = contaFelipe.getSaldo();
        Assertions.assertEquals(expectativa, resultado);

    }
}
