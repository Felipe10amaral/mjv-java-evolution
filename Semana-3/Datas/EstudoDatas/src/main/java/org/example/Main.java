package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        /*
        * Data-hora Local:
        *   - LocalDate (data-mes-ano)
        *   - LocalDateTime  (data-mes-ano-hora)
        *
        * Data-hora Global
        *   - Instant (Representa um instante no tempo)
        *
        * Duração
        *   - Duration
        *  */

        // instanciando uma data local no momento atual
        LocalDate dataLocal = LocalDate.now();
        System.out.println(dataLocal);
        LocalDateTime dataLocalHora = LocalDateTime.now(); // ele gera tambem com a fração de segundos
        System.out.println(dataLocalHora);

        //instanciando com Instant uma data global (que contem o fuso horario, local não contem)
        Instant dataGlobal = Instant.now(); // ele gera quase a mesma coisa que o LocalDateTime, a diferença é que possui o paramentro z que indica o fuso horario
                                            // e ele instancia em hora global (horario de londres onde o GMT é 0, Brasil é o GMT -3)

        System.out.println(dataGlobal);

        //instanciando uma data em formato de texto no padrão ISO 8601
        LocalDate dataTexto = LocalDate.parse("2022-10-23");
        LocalDateTime dataHoraTexto = LocalDateTime.parse("2022-10-23T14:50:00");

        System.out.println(dataTexto);
        System.out.println(dataHoraTexto);

        // instanciando uma data global com horario de brasilia
        Instant horaBR = Instant.parse("2022-10-23T14:50:00-03:00"); // ele transforma a hora de Londres para brasilia
        System.out.println(horaBR); // imprimiu 17:50 que é a hora de londres

        /* Documentação
           https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

           utlizando DateTimeFormatter, é uma classe que traz varios padrões prontos para nos auxiliar a formatar datas
         */
        DateTimeFormatter formatoDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato brasileiro
        DateTimeFormatter formatoDataBrasilHoraMinuto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // formato brasileiro

        LocalDate dataBrasil = LocalDate.parse("23/10/2022", formatoDataBrasil); // o metodo parse do localDate possui uma sobrecarga que nos permite informar qual o formato da nossa data
        LocalDateTime dataBrasilHoraMinuto = LocalDateTime.parse("20/10/2022 10:15", formatoDataBrasilHoraMinuto);
        System.out.println(dataBrasil);
        System.out.println(dataBrasilHoraMinuto);

        //instanciando dia, mes e ano separado
        LocalDate dataDiaMesAno = LocalDate.of(2022, 9, 02);
        System.out.println(dataDiaMesAno);

        // instanciando dia, mes, ano,
        LocalDateTime dataDiaHora = LocalDateTime.of(2022,9,10, 13, 20);
        System.out.println(dataDiaHora);
    }
}