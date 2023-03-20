package com.example;

public class Pruebas {
    public void pruebaCodigo(){
        System.out.println("Se van a realizar las diferentes pruebas sobre el codigo:\n");

        System.out.println("Prueba 1: Uso correcto de la funcion usando mayusculas");
        ClaseCadena cadena = new ClaseCadena();
        System.out.println("Nombre usado: Luis Miguel Urbez");
        cadena.DevuelveIniciales("Luis Miguel Urbez");
        System.out.println("\n");

        System.out.println("Prueba 2: No usar letras mayusculas");
        System.out.println("Nombre usado: luis miguel urbez");
        cadena.DevuelveIniciales("luis miguel urbez");
        System.out.println("No devuelve nada ya que es un uso incorrecto del metodo.\n");

        System.out.println("Prueba 3: Añadir numeros a la cadena");
        System.out.println("Nombre usado: Luis Miguel Urbez 123");
        cadena.DevuelveIniciales("Luis Miguel Urbez 123");
        System.out.println("Devuelve solo las letras que estan escritas en mayuscula obviando los numeros.\n");

        System.out.println("Prueba 4: Uso del metodo con todas las palbras en mayusculas");
        System.out.println("Nombre usado: LUIS MIGUEL URBEZ");
        cadena.DevuelveIniciales(" LUIS MIGUEL URBEZ");

    }
}
