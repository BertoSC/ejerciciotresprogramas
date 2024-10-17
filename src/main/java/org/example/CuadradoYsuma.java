package org.example;

import java.util.Scanner;

public class CuadradoYsuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numeros = sc.nextLine().trim().split(" ");
        int suma =0;
        int cuadrado=0;
        for (String n:numeros){
            int temp= Integer.parseInt(n);
            cuadrado=temp*temp;
            suma+=cuadrado;
        }

        System.out.println(suma);

    }
}
