package org.example;
import java.util.Scanner;

public class ProcesoPadre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int [] numeros = new int [casos];
        for (int i= 0; i < casos; i++) {
            int temp = sc.nextInt();
            numeros[i] = temp;
        }

       ProcessBuilder pb1 = new ProcessBuilder("java -cp target\classes org.example.SumaYcuadrado");

       ProcessBuilder pb2 = new ProcessBuilder("java -cp target\classes org.example.CuadradoYsuma");


    }
}