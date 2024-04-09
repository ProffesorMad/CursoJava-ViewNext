package Ejercicio2;

public class Batidora extends Electrodomestico {
	
	private int potencia;
	
	public Batidora(String marca, double precio, int potencia) {
		super(marca, precio);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}


}
