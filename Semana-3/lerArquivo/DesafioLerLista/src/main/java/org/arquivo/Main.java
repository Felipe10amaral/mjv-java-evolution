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
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}