package Ejercicio02.com;

public class Lavadora extends Electrodomestico{
	
	private int capacidad;

	public Lavadora(String marca, double precio, int capacidad) {
        super(marca, precio);
        this.capacidad = capacidad;
    }
	
	public int getCapacidad() {
		return capacidad;
	}
	
	// Método específico de la lavadora
	public void iniciarLavado() {
		System.out.println("Iniciando lavado...");
	}
}
