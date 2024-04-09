package Ejercicio2;

public class Cassette extends Electrodomestico {
	
	private boolean play;
	private boolean rewind;
	
	public Cassette(String marca, double precio) {
		super(marca, precio);
	}

	public void play() {
		System.out.println("Reproduciendo...");
	}
	
	public void rewind() {
		System.out.println("Rebobinando...");

	}
}
