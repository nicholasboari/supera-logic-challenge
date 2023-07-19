package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.println("Insira o tamanho do array");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Insira o alvo");
        int target = scan.nextInt();


        System.out.println("Insira os valores do array. Ex: 0 1 2 3 4 5");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                int condition = array[i] - array[j];
                if (condition == target || condition == (target * -1)) {
                    count++;
                }
            }
        }
        System.out.println("Vezes que o alvo foi atingido: " + count);
    }
}