package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quantos números serão inseridos?");
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        List<Integer> lista = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Insira um número (" + (i + 1) + "/" + qtd + ")");
            int numero = scan.nextInt();
            lista.add(numero);
        }

        // verifica se é par ou impar e insere na lista
        for(Integer numero: lista){
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        // Ordena os pares em ordem crescente
        Collections.sort(pares);

        // Ordena os ímpares em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());

        // Unindo as duas listas
        List<Integer> resultado = new ArrayList<>();
        resultado.addAll(pares);
        resultado.addAll(impares);

        for (Integer numero : resultado) {
            System.out.println(numero);
        }
    }
}