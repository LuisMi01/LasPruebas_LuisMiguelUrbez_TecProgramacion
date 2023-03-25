package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void ClaseCadena() {
        ClaseCadena claseCadena = new ClaseCadena();
        assertEquals("LM", claseCadena.DevuelveIniciales("Luis Miguel"));
        assertEquals("L", claseCadena.DevuelveIniciales("Luis"));
        assertEquals("", claseCadena.DevuelveIniciales("luis miguel"));
        assertEquals("LM", claseCadena.DevuelveIniciales("LUIS MIGUEL"));
    }

}