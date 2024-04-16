package Ejercicio02.com;

public class CocinaGas extends Electrodomestico{
	
	private int numerodeQuemadores;

	public CocinaGas(String marca, double precio, int numerodeQuemadores) {
		super(marca, precio);
		this.numerodeQuemadores = numerodeQuemadores;
	}

	public int getNumerodeQuemadores() {
		return numerodeQuemadores;
	}

	// Método específico de la cocina de gas
    public void encenderQuemadores() {
        System.out.println("Encendiendo quemadores...");
    }
	
}
