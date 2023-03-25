package com.example;

import java.util.StringTokenizer;

public class ClaseCadena {
    public Object DevuelveIniciales(String nombre) {
        /*String[] palabras = nombre.split(" ");

        String iniciales = "";

        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z') {
                iniciales += nombre.charAt(i);
            }
        }
        System.out.println("Las iniciales son: " + iniciales);
        return iniciales;*/

        StringTokenizer st = new StringTokenizer(nombre);
        String iniciales = "";
        while (st.hasMoreTokens()) {
                iniciales += st.nextToken().charAt(0);

        }
        System.out.println("Las iniciales son: " + iniciales);
        return iniciales;

    }

}