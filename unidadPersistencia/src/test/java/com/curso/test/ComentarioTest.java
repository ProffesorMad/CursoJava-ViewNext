package com.curso.test;

import org.junit.jupiter.api.Test;

import com.curso.dominio.Comentario;

import static org.junit.jupiter.api.Assertions.*;

public class ComentarioTest {
	
    @Test
    public void testSetTexto() {
        Comentario comentario = new Comentario();
        comentario.setTexto("Este es un comentario de prueba");
        assertEquals("Este es un comentario de prueba", comentario.getTexto());
    }
}
