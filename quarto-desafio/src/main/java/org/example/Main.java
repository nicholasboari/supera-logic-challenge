package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira a quantidade de testes");
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();

        System.out.println("Insira os testes");
        scan.nextLine();

        for (int i = 0; i < qtd; i++) {
            String linha = scan.nextLine();
            String resultado = desembaralhaLinha(linha);

            System.out.println(resultado);
        }
    }

    public static String desembaralhaLinha(String line) {
        int length = line.length();
        char[] letras = new char[length];

        int esquerdaIndice = 0;
        int direitaIndex = length - 1;

        // Insere cada letra no array letras da esquerda ate o meio
        for (int i = length / 2 - 1; i >= 0; i--) {
            letras[esquerdaIndice++] = line.charAt(i);
        }

        // Insere cada letra no array letras da direita ate o meio
        for (int i = length - 1; i >= length / 2; i--) {
            letras[direitaIndex--] = line.charAt(i);
        }

        return new String(letras);
    }
}