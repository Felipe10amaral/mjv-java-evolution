package javaFundamentos.powerClass.src;

public class Operadores {
    public static void main(String[] args) {

        // Operador usado na concatenação de String
        String nome = "Linguagem" + " " + "Java";

        System.out.println(nome);

        String concatenacao;

        /*
         * Resultado 1111, porque no momento que o compilador acha uma string, o
         * restante vai ser concatenado
         */
        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        // Operadores Ternários
        int nota = 7;

        String resultado = nota > 6 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // Comparação

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); // true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); // false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); // true

        // equals na parada
        System.out.println(nome1.equals(nome2)); // true
        System.out.println(nome2.equals(nome3)); // true
        System.out.println(nome3.equals(nome4)); // true

        // For each

        String alunos[] = { "Felipe", "Tamires", "Tufao" };

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        // Maven
        // Gerenciador de pacotes

    }
}
