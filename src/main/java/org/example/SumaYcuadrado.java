package org.example;

import java.util.Scanner;

public class SumaYcuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer la cantidad de números
        int cantidad = sc.nextInt();

        int sum = 0;

        // Leer exactamente "cantidad" de números y sumarlos
        for (int i = 0; i < cantidad; i++) {
            sum += sc.nextInt();
        }

        // Calcular el cuadrado de la suma
        int resultado = sum * sum;

        // Imprimir el resultado
        System.out.println(resultado);
    }
}