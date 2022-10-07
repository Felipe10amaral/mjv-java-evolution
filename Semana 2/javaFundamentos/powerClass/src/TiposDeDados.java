package javaFundamentos.powerClass.src;

import java.util.Objects;

public class TiposDeDados {
    public static void main(String[] args) {
        // byte idade = 123;
        // short ano = 2021;
        int cep = 28400000; // se começar com zero talvez seja outro tipo
        long cpf = 12312312300L;
        // float pi = 3.14F;
        double salario = 3000.20;

        // Tipos mais usados não estão comentados

        final double pi = 3.14;

        // final garante que não pode ser alterado
        // pi = 3.15

        TiposDeDados tp = new TiposDeDados();
        /*
         * É uma classe utilitária, ela é composta de métodos estáticos que fazem
         * operações sobre objetos
         * podemos verificar se ela é nula ou não, podemos ver o toString dentre outras
         * coisas
         */

        // Objects.isNull(tp);
    }
}
