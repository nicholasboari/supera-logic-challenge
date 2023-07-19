package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira uma quantidade. Ex: (199.99)");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        float value = convertToFloatAndVerifyIsValid(input);

        // 19999
        int valueEmCentavos = (int) (value * 100);

        //                        19999  9999  4999  2999  999  99
        int[] notasEmCentavos = { 10000, 5000, 2000, 1000, 500, 200 };

        //                              99  49  24  4  4  0
        int[] moedasEmCentavos = { 100, 50, 25, 10, 5, 1 };

        System.out.println("Notas:");
        for (int nota : notasEmCentavos) {
            // pega a quantidade de notas
            int quantidade = valueEmCentavos / nota;
            System.out.println(quantidade + " nota(s) de R$" + (nota / 100));

            // pega o resto da divisao e atribui
            valueEmCentavos = valueEmCentavos  % nota;
        }

        System.out.println("Moedas:");
        for (int moeda : moedasEmCentavos) {
            // pega a quantidade de moedas
            int quantidade = valueEmCentavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);

            // pega o resto da divisao e atribui
            valueEmCentavos = valueEmCentavos  % moeda;
        }
    }

    private static float convertToFloatAndVerifyIsValid(String input) {
        // Remover a virgula caso exista
        input = input.replace(",", "");

        float value = Float.parseFloat(input);

        // verifica se o valor tem mais que 3 casas
        String valueString = String.valueOf(value); // Converter o número para uma string
        int decimalPlaces = valueString.length() - valueString.indexOf('.') - 1; // Calcular o número de casas decimais
        if (decimalPlaces >= 3) {
            throw new RuntimeException("O número tem três ou mais casas decimais.");
        }
        return Float.parseFloat(valueString);
    }
}