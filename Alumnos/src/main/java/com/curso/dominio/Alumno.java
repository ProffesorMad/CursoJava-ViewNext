package com.curso.dominio;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity

@NamedQueries({
    @NamedQuery(name="seleccionarTodosAlumnos", query="SELECT a FROM Alumno a"),
    @NamedQuery(name="seleccionarAlumnoPorId", query="SELECT a FROM Alumno a WHERE a.id = :id"),
    @NamedQuery(name="seleccionarAlumnoPorNombre", query="SELECT a FROM Alumno a WHERE a.nombre = :nombre"),
    @NamedQuery(name="seleccionarAlumnoPorApellido", query="SELECT a FROM Alumno a WHERE a.apellido = :apellido")
})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String cursos;
	
	public Alumno(String nombre, String apellido, String cursos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cursos = cursos; 
	}
	
	
	public Alumno() {
		super();
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCurso() {
		return cursos;
	}


	public void setCurso(String cursos) {
		this.cursos = cursos;
	}


	@Override
	public String toString() {
		return "El alumno " + nombre + " " + apellido + " pertenece a los cursos de " + cursos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return id == other.id;
	}


	
}