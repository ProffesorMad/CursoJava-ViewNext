package Ejercicio10.com;

public class Rectangulo extends FiguraGeometrica {

    double base;
    double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método para calcular el área
    
    @Override
    double calcularArea() {
        return base * altura;
    }

    // Implementación del método para calcular el perímetro
    
    @Override
    double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
