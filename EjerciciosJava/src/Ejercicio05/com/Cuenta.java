package Ejercicio05.com;

public class Cuenta {
	
    private String titular;
    private double cantidad;

    // Constructor con titular obligatorio y cantidad opcional
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad >= 0 ? cantidad : 0;
    }

    // Método para obtener el titular de la cuenta
    public String getTitular() {
        return titular;
    }

    // Método para establecer el titular de la cuenta
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Método para obtener la cantidad de la cuenta
    public double getCantidad() {
        return cantidad;
    }

    // Método para establecer la cantidad de la cuenta
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad >= 0 ? cantidad : 0;
    }

    // Método para ingresar una cantidad a la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Método para retirar una cantidad de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad -= cantidad;
            }
        }
    }

    // Método toString para representar la cuenta como cadena de texto
    @Override
    public String toString() {
        return "Cuenta:" +
                "Titular = " + titular +
                "  Cantidad = " + cantidad ;
    }
}

