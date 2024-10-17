package org.example;

import java.util.Scanner;

public class CuadradoYsuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer la cantidad de números
        int cantidad = sc.nextInt();

        int suma = 0;

        // Leer exactamente "cantidad" de números
        for (int i = 0; i < cantidad; i++) {
            int temp = sc.nextInt();
            int cuadrado = temp * temp;
            suma += cuadrado;
        }

        // Imprimir la suma de los cuadrados
        System.out.println(suma);
    }
}