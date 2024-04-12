package Ejercicio7;

public class Tambor extends Instrumento{

	private int tamanio;
	
	public Tambor(String nombre, String tipo, int tamanio) {
		super(nombre, tipo);
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Tambor --> Tamaño = " + tamanio + "  Nombre = " + nombre + "  Tipo = " + tipo ;
	}

	public void aporrear() {
		System.out.println("Aporreando " + nombre);
	}
	
}
