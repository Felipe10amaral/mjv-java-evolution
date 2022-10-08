import org.digytal.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @DisplayName("Testando o metodo somar")
    @Test
    void TesteCalculadoraSoma(){
        int expectativa = 7;
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(4,3);
        Assertions.assertEquals(expectativa, resultado);
    }
}
