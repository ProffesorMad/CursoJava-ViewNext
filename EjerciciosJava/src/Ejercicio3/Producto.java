package Ejercicio3;

public abstract class Producto {
    private int codigoProducto;
    private String modelo;
    private double precio;
    private int cantidadDisponible;

    public Producto(int codigoProducto, String modelo, double precio, int cantidadDisponible) {
        this.codigoProducto = codigoProducto;
        this.modelo = modelo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public abstract String toString();
}