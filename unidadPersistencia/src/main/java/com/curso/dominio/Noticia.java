package com.curso.dominio;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Noticia {
    @Id
    private String titulo;
    private String autor;
    private String fecha;

    @OneToMany(mappedBy = "noticia", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

	public Noticia(String titulo, String autor, String fecha, List<Comentario> comentarios) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
		this.comentarios = comentarios;
	}

	public Noticia() {
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getFecha() {
		return fecha;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	public void agregarComentario(Comentario comentario) {
        if (comentarios == null) {
            comentarios = new ArrayList<>();
        }
        comentarios.add(comentario);
        comentario.setNoticia(this);
    }

    public void eliminarComentario(Comentario comentario) {
        if (comentarios != null) {
            comentarios.remove(comentario);
            comentario.setNoticia(null);
        }
    }

	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + ", comentarios=" + comentarios
				+ "]";
	}

    
}