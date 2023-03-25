package com.example;

public class ClaseCadena {
    public Object DevuelveIniciales(String nombre){

        String[] palabras = nombre.split(" ");

        String iniciales = "";

        for (int i = 0; i < nombre.length(); i++) {
            if ( nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z' ) {
                    iniciales += nombre.charAt(i);
            }
        }
        System.out.println("Las iniciales son: " + iniciales);
        return iniciales;
    }
}