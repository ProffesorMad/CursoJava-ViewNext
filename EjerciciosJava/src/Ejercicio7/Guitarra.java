package Ejercicio7;

public class Guitarra extends Instrumento{

	protected int numeroCuerdas;
	
	public Guitarra(String nombre, String tipo, int numeroCuerdas) {
		super(nombre, tipo);
		this.numeroCuerdas = numeroCuerdas;
	}

	@Override
	public String toString() {
		return "Guitarra --> Numero de Cuerdas = " + numeroCuerdas + "  Nombre = " + nombre + "  Tipo=" + tipo ;
	}
	
}