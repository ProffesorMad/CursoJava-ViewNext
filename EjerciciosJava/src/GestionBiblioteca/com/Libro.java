package GestionBiblioteca.com;

public class Libro extends Documento {
	
    private int añoPublicacion;

    public Libro(String codigo, String titulo, int duracionMaximaPrestamo, int añoPublicacion) {
        super(codigo, titulo, duracionMaximaPrestamo);
        this.añoPublicacion = añoPublicacion;
    }

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

}
