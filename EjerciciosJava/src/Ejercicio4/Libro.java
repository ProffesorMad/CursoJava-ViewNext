package Ejercicio4;

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

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
	    return "El libro \"" + titulo + "\" con IBSN " + ISBN + " creado por " + autor + " tiene " + paginas + " páginas ";
	}
	
	
}
