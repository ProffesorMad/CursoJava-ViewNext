package com.curso.principal;

import com.curso.dominio.Comentario;
import com.curso.dominio.Noticia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
	
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidadPersistencia");
        EntityManager em = emf.createEntityManager();

        
        em.getTransaction().begin();
        Noticia noticia = new Noticia();
        noticia.setTitulo("Título de la noticia");
        noticia.setAutor("Autor de la noticia");
        noticia.setFecha("2024-05-16");

        Comentario comentario = new Comentario();
        comentario.setTexto("Este es un comentario");
        comentario.setAutor("Autor del comentario");
        comentario.setNoticia(noticia);

        em.persist(noticia);
        em.persist(comentario);
        em.getTransaction().commit();

        
        em.getTransaction().begin();
        Noticia noticiaConsultada = em.find(Noticia.class, "Título de la noticia");
        System.out.println("Noticia encontrada: " + noticiaConsultada.getTitulo());
        System.out.println("Cantidad de comentarios: " + noticiaConsultada.getComentarios().size());
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}