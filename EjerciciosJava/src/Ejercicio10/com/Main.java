package Ejercicio10.com;

public class Main {
	
    public static void main(String[] args) {
    	
        // Crear instancias de las figuras geométricas
    	
        Rectangulo rectangulo = new Rectangulo(20, 7);
        Cuadrado cuadrado = new Cuadrado(17);
        Circulo circulo = new Circulo(23);

        // Calcular y mostrar el área y el perímetro de cada figura
        
        System.out.println("Rectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println("\nCuadrado:");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());

        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}
