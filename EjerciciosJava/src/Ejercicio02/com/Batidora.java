package Ejercicio02.com;

public class Batidora extends Electrodomestico {
	
	private int voltaje;
	
	public Batidora(String marca, double precio, int voltaje) {
		super(marca, precio);
		this.voltaje = voltaje;
	}

	public int getVoltaje() {
		return voltaje;
	}

	// Método específico de la batidora
    public void batir() {
        System.out.println("Batiendo...");
    }
}

