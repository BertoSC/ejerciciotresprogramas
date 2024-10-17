package org.example;

import java.util.Scanner;

public class SumaYcuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int suma =0;
        for (int i= 0; i < casos; i++){
            int temp= sc.nextInt();
            suma+=temp;
        }
        int cuadrado=suma*suma;
        System.out.println(cuadrado);

    }
}

