package org.example;

import java.util.Scanner;

public class CuadradoYsuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int suma =0;
        int cuadrado=0;
        for (int i= 0; i < casos; i++){
            int temp= sc.nextInt();
            cuadrado=temp*temp;
            suma+=cuadrado;
        }

        System.out.println(suma);

    }
}
