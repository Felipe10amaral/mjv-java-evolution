package org.arquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("/home/felipe/Área de Trabalho/arquivo/banco.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) { // esse while testa para ve se ainda existe uma nova linha no arquivo
                System.out.println(sc.nextLine());  // se existir uma linha ele vai imprimir na tela
            }
        }
        catch (IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        finally {
            // condicional para testar se o sc esta nulo para evitar uma null pointer exception
            if(sc != null) {
                sc.close();
            }
        }
    }
}