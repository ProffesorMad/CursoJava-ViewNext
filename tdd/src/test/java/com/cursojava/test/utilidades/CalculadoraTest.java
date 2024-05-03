package com.cursojava.test.utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cursojava.utilidades.Calculadora;

class CalculadoraTest {

	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora();
		
		double suma = calculadora.sumar(4, 3);
		
		assertEquals(7,suma);
	}

	
}
