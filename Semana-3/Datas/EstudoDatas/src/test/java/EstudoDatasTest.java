import datas.UtilizandoLocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EstudoDatasTest {

    UtilizandoLocalDate dataTeste;

    //@BeforeEach é utilizando pra executar o codigo antes de iniciar qualquer teste
    @BeforeEach
    void setup() {
        dataTeste = new UtilizandoLocalDate();
    }

    @DisplayName("Este teste vai verificar se o metodo vai calcular a difereça entre 2 datas ")
    @Test
    void testarDiferencaComData(){
        LocalDate data1 = LocalDate.of(2022, 9, 2);
        LocalDate data2 = LocalDate.of(2022, 9, 22);
        int expectativa = 10;
        int resultado;
        resultado = dataTeste.subtracaoDias(data1, data2);

        Assertions.assertEquals(expectativa, resultado);

    }


}
