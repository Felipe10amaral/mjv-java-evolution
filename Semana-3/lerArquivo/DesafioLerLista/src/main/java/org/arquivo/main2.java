package org.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main2 {
    public static void main(String[] args) {

        String path = "/home/felipe/Área de Trabalho/arquivo/banco.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader); //o bufferedReader é instaciado atraves do fileReader

            String line = bufferedReader.readLine();  //ele vai ler uma linha do arquivo, se o arquivo ja estiver no final ele retorna nulo

            while (line != null) {
                System.out.println(line); //imprimindo a linha que foi lida com sucesso
                line = bufferedReader.readLine(); // testando a proxima linha
            }
        }
        catch (IOException e) {
            System.out.println("Erro" + e.getMessage());
        }
        finally {
            try {                             // é necessario tratar caso haja uma exceção na hora de fechar
                if(fileReader != null) {
                    fileReader.close();
                }
                if(bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
