package Ejercicio04.com;

public class Libro {
	
	private String ISBN;
	private String titulo;
	private String autor;
	private int paginas;
	
	public Libro(String iSBN, String titulo, String autor, int paginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getPaginas() {
		return paginas;
	}

	@Override
	public String toString() {
	    return "El libro \"" + titulo + "\" con IBSN " + ISBN + " creado por " + autor + " tiene " + paginas + " páginas ";
	}
	
	
}
