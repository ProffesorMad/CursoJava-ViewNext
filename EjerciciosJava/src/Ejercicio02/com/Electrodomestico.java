package Ejercicio02.com;

public class Electrodomestico {
	
	private String marca;
	private double precio;
	
	public Electrodomestico(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	// Métodos específicos del Electrodomestico
	public void encender() {
        System.out.println("Encendiendo...");
    }

    public void apagar() {
        System.out.println("Apagando...");
    }
}


