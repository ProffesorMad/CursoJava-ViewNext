package com.curso.consultas;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class CPrecio {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
        EntityManager em = emf.createEntityManager();
        
        // Realizar consulta para contar películas por precio
        TypedQuery<Object[]> consulta = em.createQuery("SELECT p.precioAlquiler, COUNT(p) FROM Pelicula p GROUP BY p.precioAlquiler", Object[].class);
        List<Object[]> resultados = consulta.getResultList();
        
        for (Object[] resultado : resultados) {
            double precioAlquiler = (double) resultado[0];
            long cantidad = (long) resultado[1];
            System.out.println("Precio: " + precioAlquiler + "€ - Cantidad de películas: " + cantidad);
        }
        
        em.close();
        emf.close();
    }
}
