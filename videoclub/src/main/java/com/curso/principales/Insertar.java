package com.curso.principales;

import com.curso.dominio.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Insertar {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		Pelicula pelicula = new Pelicula( 9 , "The Matrix", "Lana Wachowski", 15.00);
		
		em.getTransaction().begin();
		em.persist(pelicula);
		em.getTransaction().commit();
			
	}

}
