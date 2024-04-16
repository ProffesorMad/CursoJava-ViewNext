package Ejercicio02.com;

public class CD extends Electrodomestico {

	private boolean play;

	public CD(String marca, double precio) {
		super(marca, precio);
	}

	public void play() {
		System.out.println("Reproduciendo...");
	}
}
