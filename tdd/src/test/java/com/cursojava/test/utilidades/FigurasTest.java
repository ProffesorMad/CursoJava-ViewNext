package com.cursojava.test.utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cursojava.utilidades.Figuras;

public class FigurasTest {
    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(12.0, Figuras.calcularAreaRectangulo(3, 4), 0.01);
    }

    @Test
    public void testCalcularPerimetroRectangulo() {
        assertEquals(14.0, Figuras.calcularPerimetroRectangulo(3, 4), 0.01);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(9.0, Figuras.calcularAreaCuadrado(3), 0.01);
    }

    @Test
    public void testCalcularPerimetroCuadrado() {
        assertEquals(12.0, Figuras.calcularPerimetroCuadrado(3), 0.01);
    }

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(12.566, Figuras.calcularAreaCirculo(2), 0.01);
    }

    @Test
    public void testCalcularPerimetroCirculo() {
        assertEquals(12.566, Figuras.calcularPerimetroCirculo(2), 0.01);
    }
}