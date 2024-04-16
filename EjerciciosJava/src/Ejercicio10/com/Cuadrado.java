package Ejercicio10.com;

public class Cuadrado extends FiguraGeometrica {
	
    double lado;

    // Constructor
    Cuadrado(double lado) {
        this.lado = lado;
    }

    // Implementación del método para calcular el área
    public double calcularArea() {
        return lado * lado;
    }

    // Implementación del método para calcular el perímetro
    public double calcularPerimetro() {
        return 4 * lado;
    }
}