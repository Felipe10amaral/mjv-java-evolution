import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    // assinatura do método
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ContaCorrente conta01 = new ContaCorrente();
        conta01.setNumeroAgencia(001);
        conta01.setNumeroConta(123);
        conta01.setNomeCliente("Felipe");

        System.out.println(conta01.getNumeroConta());

        // tipo primitivo
        double n = 1;

        // tipo Wrapper
        Double nn = 1.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor");
        BigDecimal value = sc.nextBigDecimal();

        System.out.println("Entre com o segundo valor");
        BigDecimal value2 = sc.nextBigDecimal();

        BigDecimal result = value.add(value2);

        System.out.println(result);

        Trabalho teste = new Trabalho(value, value2);

        BigDecimal resultTeste = teste.addValue(value, value2);

        System.out.println(resultTeste);

        sc.close();
    }
}
