package Ejercicio3;

public class Telefono extends Producto {
    private String operador;

    public Telefono(int codigoProducto, String modelo, double precio, int cantidadDisponible, String operador) {
        super(codigoProducto, modelo, precio, cantidadDisponible);
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "codigoProducto='" + getCodigo() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", precio=" + getPrecio() +
                ", cantidadDisponible=" + getCantidad() +
                ", operador='" + operador + '\'' +
                '}';
    }
}
