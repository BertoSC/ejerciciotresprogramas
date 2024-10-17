package org.example;

import java.io.*;
import java.util.Scanner;

public class ProcesoPadre {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Leer la cantidad de números
        int casos = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        // Leer los números y formar la cadena
        sb.append(casos).append(" "); // Agregar la cantidad de números a la cadena
        for (int i = 0; i < casos; i++) {
            int temp = sc.nextInt();
            sb.append(temp).append(" ");
        }

        String cadena = sb.toString().trim();  // Cadena de números (incluye la cantidad)

        // Crear el proceso para ejecutar la clase SumaYcuadrado
        ProcessBuilder pb1 = new ProcessBuilder("java", "-cp", "target\\classes", "org.example.SumaYcuadrado");
        Process process1 = pb1.start();

        // Enviar la cadena de números al proceso hijo
        try (OutputStream os = process1.getOutputStream();
             PrintWriter pw = new PrintWriter(os, true)) {
            pw.println(cadena); // Enviar cantidad y números
        }

        // Leer la salida del proceso hijo
        BufferedReader br = new BufferedReader(new InputStreamReader(process1.getInputStream()));
        String resultado1 = br.readLine();
        System.out.println("Resultado del Proceso Hijo (SumaYcuadrado): " + resultado1);

        // Leer errores del proceso hijo (si los hay)
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process1.getErrorStream()));
        String errorLine;
        while ((errorLine = errorReader.readLine()) != null) {
            System.err.println("Error: " + errorLine);
        }

        // Crear el proceso para ejecutar la clase CuadradoYsuma
        ProcessBuilder pb2 = new ProcessBuilder("java", "-cp", "target\\classes", "org.example.CuadradoYsuma");
        Process process2 = pb2.start();

        // Enviar la cadena de números al proceso hijo
        try (OutputStream os2 = process2.getOutputStream();
             PrintWriter pw2 = new PrintWriter(os2, true)) {
            pw2.println(cadena); // Enviar cantidad y números
        }

        // Leer la salida del proceso hijo
        BufferedReader br2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
        String resultado2 = br2.readLine();
        System.out.println("Resultado del Proceso Hijo (CuadradoYsuma): " + resultado2);

        // Leer errores del proceso hijo (si los hay)
        BufferedReader errorReader2 = new BufferedReader(new InputStreamReader(process2.getErrorStream()));
        String errorLine2;
        while ((errorLine2 = errorReader2.readLine()) != null) {
            System.err.println("Error: " + errorLine2);
        }
    }
}