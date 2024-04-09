package Ejercicio2;

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
	
	public void encender() {
        System.out.println("Encendiendo...");
    }

    public void apagar() {
        System.out.println("Apagando...");
    }
}


