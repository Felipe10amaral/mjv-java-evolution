import org.digytal.ContaCorrente;
import org.junit.jupiter.api.*;

import java.time.LocalDate;


public class ContaBancariaTeste {
    ContaCorrente contaFicticia;

    //é executado antes de cada teste
    @BeforeEach
    void setup() {
        contaFicticia = new ContaCorrente(1, 012, LocalDate.now() );
    }


    @DisplayName("Testando método deposito")
    @Test
    void testarDeposito() {
        Double expectativa = 60.00;
        ContaCorrente contaFelipe = new ContaCorrente(1, 1, LocalDate.now());
        contaFelipe.depositar(60.00);
        Double resultado = contaFelipe.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

    @DisplayName("Testando método deposito com valor abaixo de 0")
    @Test
    void testarDepositoValorNegativo() {
        ContaCorrente contaFelipe = new ContaCorrente(1, 1, LocalDate.now());
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> contaFelipe.depositar(0.0));
        String expectativa = "O valor de depósito deve ser superior a zero";
        Assertions.assertEquals(expectativa, exception.getMessage());
    }

    @DisplayName("Testando método de saque")
    @Test
    void testarSaque() {
        Double expectativa = 20.0;
        ContaCorrente contaFelipe = new ContaCorrente(1, 1, LocalDate.now());
        contaFelipe.depositar(30.0);
        contaFelipe.sacar(10.0);
        Double resultado = contaFelipe.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

    @DisplayName("Testando o metodo de transferencia")
    @Test
    void testarTransferencia() {
        ContaCorrente contaFelipe = new ContaCorrente(1, 1, LocalDate.now());
        ContaCorrente contaTamires = new ContaCorrente(2, 1, LocalDate.now());
        contaFelipe.depositar(100.00);
        Double expectativa = 30.00;
        contaFelipe.transferir(30.00, contaTamires);
        Double resultado = contaTamires.getSaldo();
        Assertions.assertEquals(expectativa, resultado);
    }

    @DisplayName("Testando transferencia sem informar o destino")
    @Test
    void testarTransferenciaSemDestino(){
        RuntimeException illegal = Assertions.assertThrows(RuntimeException.class, ()-> contaFicticia.transferir(50.0, null));
        String expectativa = "A conta destino não pode ser nula";
        Assertions.assertEquals(expectativa, illegal.getMessage());
    }

    @DisplayName("Testando o metodo de cancelar a conta sem a justificativa")
    @Test
    void testarCancelarConta() {
        ContaCorrente contaFelipe = new ContaCorrente(1,1, LocalDate.now());
        Boolean expectativa = contaFelipe.cancelar("g ");
        Assertions.assertTrue(expectativa);
    }

    @DisplayName("Testar o extrato com as duas datas nula")
    @Test
    void testarExtratoComDataNula(){
        RuntimeException illegal = Assertions.assertThrows(IllegalArgumentException.class, () -> contaFicticia.consultarExtrato(null, null));
        String expectativa = "Data inicial ou data final inválida";
        Assertions.assertEquals(expectativa, illegal.getMessage());
    }

    @DisplayName("Testar o extrato com a primeira data nula")
    @Test
    void testarExtratoComAPrimeiraDataNula() {
        IllegalArgumentException illegal = Assertions.assertThrows(IllegalArgumentException.class, () -> contaFicticia.consultarExtrato(null, LocalDate.now()));
        String expectativa = "Data inicial ou data final inválida";
        Assertions.assertEquals(expectativa, illegal.getMessage());
    }

    @DisplayName("Testar o extrato com a segunda data nula")
    @Test
    void testarExtratoComAsegundaDataNula() {
        IllegalArgumentException illegal = Assertions.assertThrows(IllegalArgumentException.class, () -> contaFicticia.consultarExtrato(LocalDate.now(),null));
        String expectativa = "Data inicial ou data final inválida";
        Assertions.assertEquals(expectativa, illegal.getMessage());
    }



}

