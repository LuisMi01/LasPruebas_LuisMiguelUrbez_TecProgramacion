package com.example;

import java.util.Scanner;

public class ClaseCadena {
    public void DevuelveIniciales(String nombre){
        String[] palabras = nombre.split(" ");
        String iniciales = "";
        for(int i = 0; i < nombre.length(); i++){
            if(nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z'){
                iniciales += nombre.charAt(i);
            }
        }
        System.out.println("Las iniciales son: " + iniciales);

        //GEnerame un codigo que me devuelva las iniciales que esten  en mayucula  de una cadena

    }
}