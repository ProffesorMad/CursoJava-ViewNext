package Ejercicio3;

public class Producto {

	private int codigo;
	private String modelo;
	private double precio;
	private int cantidad;
	
	public Producto(int codigo, String modelo, double precio, int cantidad) {
		this.codigo = codigo;
		this.modelo = modelo;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", modelo=" + modelo + ", precio=" + precio + ", cantidad=" + cantidad
				+ "]";
	}
	
	
	
	
}
