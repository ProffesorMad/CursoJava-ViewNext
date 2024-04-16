package Ejercicio10.com;

public class Circulo extends FiguraGeometrica {
	
    double radio;

    // Constructor
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método para calcular el área
    
    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del método para calcular el perímetro
    
    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
