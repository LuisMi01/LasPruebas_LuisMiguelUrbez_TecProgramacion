package com.example;

import java.util.StringTokenizer;

public class ClaseCadena {
    public Object DevuelveIniciales(String nombre) {
        //Para comprobar que el codigo funciona hay que realizar test en la carpeta test.java.com.example

        StringTokenizer st = new StringTokenizer(nombre);
        String iniciales = "";
        if (nombre.charAt(0) >= 'A' && nombre.charAt(0) <= 'Z'){

            while (st.hasMoreTokens()) {
                iniciales += st.nextToken().charAt(0);
            }
        }
        System.out.println("Las iniciales son: " + iniciales);
        return iniciales;

    }

}