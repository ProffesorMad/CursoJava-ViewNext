package com.curso.test;

import org.junit.jupiter.api.Test;

import com.curso.dominio.Comentario;
import com.curso.dominio.Noticia;

import static org.junit.jupiter.api.Assertions.*;

public class NoticiaTest {
	
    @Test
    public void testAgregarComentario() {
        Noticia noticia = new Noticia();
        Comentario comentario = new Comentario();
        noticia.agregarComentario(comentario);
        assertEquals(1, noticia.getComentarios().size());
    }

    @Test
    public void testEliminarComentario() {
        Noticia noticia = new Noticia();
        Comentario comentario = new Comentario();
        noticia.agregarComentario(comentario);
        assertEquals(1, noticia.getComentarios().size());
        noticia.eliminarComentario(comentario);
        assertEquals(0, noticia.getComentarios().size());
    }
}
