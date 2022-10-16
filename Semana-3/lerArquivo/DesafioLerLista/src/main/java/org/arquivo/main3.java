package org.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main3 {
    public static void main(String[] args){
        /* Usando try-with-resources
            É um bloco try que declara um ou mais recursos , e garante que esses recursos serão fechados ao final do bloco
         */

        String path = "/home/felipe/Área de Trabalho/arquivo/banco.txt";

        try (BufferedReader bufferedReader = new BufferedReader( new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro" + e.getMessage());
        }


    }
}
