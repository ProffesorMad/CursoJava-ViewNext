package com.cursojava.utilidades;

public class Figuras{
	
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}