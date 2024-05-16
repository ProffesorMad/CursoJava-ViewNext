package com.curso.dominio;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Comentario {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;
    private String autor;

    @ManyToOne
    @JoinColumn(name = "noticia_titulo")
    private Noticia noticia;

	public Comentario(Long id, String texto, String autor, Noticia noticia) {
		super();
		this.id = id;
		this.texto = texto;
		this.autor = autor;
		this.noticia = noticia;
	}

	public Comentario() {
		
	}

	public Long getId() {
		return id;
	}

	public String getTexto() {
		return texto;
	}

	public String getAutor() {
		return autor;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", texto=" + texto + ", autor=" + autor + ", noticia=" + noticia + "]";
	}

    
}