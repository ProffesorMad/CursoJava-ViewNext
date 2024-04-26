package com.cursojava.test.utilidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cursojava.utilidades.Pesetas;

public class PesetasTest {
	
    @Test
    public void testEurosAPesetas() {
        assertEquals(1663.86, Pesetas.eurosAPesetas(10), 0.01); // Verifica que 10 euros sean 1663.86 pesetas.
    }

    @Test
    public void testPesetasAEuros() {
        assertEquals(601.01, Pesetas.pesetasAEuros(100000), 0.01); // Verifica que 10000 pesetas sean 60 euros.
    }
}
