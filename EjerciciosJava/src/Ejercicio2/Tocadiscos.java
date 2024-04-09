package Ejercicio2;

public class Tocadiscos extends Electrodomestico{
	
	private int Velocidad;

	public Tocadiscos(String marca, double precio, int velocidad) {
		super(marca, precio);
		Velocidad = velocidad;
	}

	public int getVelocidad() {
		return Velocidad;
	}

	// Método específico del tocadiscos
    public void reproducir() {
        System.out.println("Reproduciendo...");
    }
}

