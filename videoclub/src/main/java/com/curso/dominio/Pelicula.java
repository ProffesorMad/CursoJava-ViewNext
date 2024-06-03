package com.curso.dominio;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    private int codigo;
    private String titulo;
    private String director;
    private double precioAlquiler; 

    public Pelicula() {
        super();
    }

    public Pelicula(int codigo, String titulo, String director, double precioAlquiler) { 
        super();
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.precioAlquiler = precioAlquiler;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getPrecio() { 
        return precioAlquiler;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setPrecio(double precioAlquiler) { 
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pelicula other = (Pelicula) obj;
        return Objects.equals(codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "La pelicula \"" + titulo + "\" con codigo " + codigo + " está dirigido por " + director + " y su precio de alquiler es " + precioAlquiler + "€";
    }
}
