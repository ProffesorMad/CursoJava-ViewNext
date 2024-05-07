package com.productos;

public class Productos {

	private int id;
	private String nombre;
	private String seccion;
	private double precio;
	private int stock;
	
	public Productos(int id, String nombre, String seccion, double precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.seccion = seccion;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

		
}
