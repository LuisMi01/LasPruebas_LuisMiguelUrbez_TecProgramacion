package com.example;

import java.util.Scanner;

public class ClaseCadena {
    public void DevuelveIniciales(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre y apellidos: ");
        String nombre = teclado.nextLine();

        
        String[] palabras = nombre.split(" ");
        String iniciales = "";
        for (String palabra : palabras) {
            iniciales += palabra.charAt(0);
        }
        System.out.println(iniciales);

        teclado.close();

    }
}