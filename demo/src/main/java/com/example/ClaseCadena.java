package com.example;

public class ClaseCadena {
    public void DevuelveIniciales(){
        String nombre = "Juan Perez";
        String[] palabras = nombre.split(" ");
        String iniciales = "";
        for (String palabra : palabras) {
            iniciales += palabra.charAt(0);
        }
        System.out.println(iniciales);
    }
}
