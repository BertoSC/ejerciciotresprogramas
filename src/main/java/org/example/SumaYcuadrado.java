package org.example;

import java.util.Scanner;

public class SumaYcuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer la línea completa que contiene los números
        String[] numeros = sc.nextLine().trim().split(" ");
        int sum = 0;

        // Convertir los números a enteros y sumarlos
        for (String numero : numeros) {
            sum += Integer.parseInt(numero);
        }

        // Calcular el cuadrado de la suma
        int resultado = sum * sum;

        // Imprimir el resultado
        System.out.println(resultado);
    }
}
