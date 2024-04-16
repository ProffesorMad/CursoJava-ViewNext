package Ejercicio07.com;

public class Flauta extends Instrumento{

	private String modelo;

	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Flauta --> Modelo = " + modelo + "  Nombre = " + nombre + "  Tipo = " + tipo ;
	}

	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Soplando.");
	}
	
}