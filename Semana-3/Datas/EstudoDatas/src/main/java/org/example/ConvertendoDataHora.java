package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHora {
    public static void main(String[] args){
        // transformando o objeto data em texto, o toString formata em ISO 8601

        LocalDate data = LocalDate.parse("2022-09-02");
        DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(data.format(formatoBrasil)); //format permite voce customizar o formato desejado para imprimir a data
    }
}
