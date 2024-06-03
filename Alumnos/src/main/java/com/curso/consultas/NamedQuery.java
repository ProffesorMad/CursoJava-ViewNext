package com.curso.consultas;

import java.util.List;

import com.curso.dominio.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class NamedQuery {

	public static void main(String[] args) {
		List<Alumno> listaAuxAlumno;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alumnos");
		EntityManager em = emf.createEntityManager();
			
		System.out.println("Mostrar todos los alumnos");
		TypedQuery<Alumno> consulta = em.createNamedQuery("seleccionarTodosAlumnos", Alumno.class);
		listaAuxAlumno = consulta.getResultList();
		for(Alumno alum : listaAuxAlumno) {
			System.out.println(alum.toString());
		}
		listaAuxAlumno = null;
		
		System.out.println("\nMostrar todos los alumnos del ID 1 ");
		TypedQuery<Alumno> consulta1 = em.createNamedQuery("seleccionarAlumnoPorId", Alumno.class);
		consulta1.setParameter("id", 1);
		listaAuxAlumno = consulta1.getResultList();
		for(Alumno alum : listaAuxAlumno) {
			System.out.println(alum.toString());
		}
		listaAuxAlumno = null;
		
		System.out.println("\nMostrar todos los alumnos del curso Matemáticas y Física ");
		TypedQuery<Alumno> consulta2 = em.createNamedQuery("seleccionarAlumnoPorCursos", Alumno.class);
		consulta2.setParameter("cursos", "Matemáticas, Física");
		for(Alumno alum : listaAuxAlumno) {
			System.out.println(alum.toString());
		}
		listaAuxAlumno = null;
		

	}

}