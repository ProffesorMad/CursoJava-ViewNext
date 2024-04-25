package GestionBiblioteca.com;

public class Documento {
	
    private String codigo;
	private String titulo;
    private int duracionMaximaPrestamo;
    private boolean prestado;

    public Documento(String codigo, String titulo, int duracionMaximaPrestamo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracionMaximaPrestamo = duracionMaximaPrestamo;
        this.prestado = false;
    }

    public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracionMaximaPrestamo() {
		return duracionMaximaPrestamo;
	}

	public boolean isPrestado() {
		return prestado;
	}
}

