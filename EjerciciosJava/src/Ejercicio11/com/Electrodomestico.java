package Ejercicio11.com;

public class Electrodomestico {
	
    // Atributos
	
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    // Constantes
    
    private final String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
    private final char[] letrasConsumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};
    private final double[] preciosConsumo = {100, 80, 60, 50, 30, 10};
    private final double[] preciosPorPeso = {10, 50, 80, 100};

    // Constructor por defecto
    
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    // Constructor con precio y peso
    
    public Electrodomestico(double precioBase, double peso) {
        this(); // Llama al constructor por defecto para inicializar los valores por defecto
        this.precioBase = precioBase;
        this.peso = peso;
    }

    // Constructor con todos los atributos
    
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Métodos get
    
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    // Método para comprobar el consumo energético
    
    private char comprobarConsumoEnergetico(char letra) {
        boolean valido = false;
        for (char c : letrasConsumoEnergetico) {
            if (letra == c) {
                valido = true;
                break;
            }
        }
        if (!valido) {
            letra = 'F'; // Por defecto
        }
        return letra;
    }

    // Método para comprobar el color
    
    private String comprobarColor(String color) {
        boolean valido = false;
        for (String c : coloresDisponibles) {
            if (color.equalsIgnoreCase(c)) {
                valido = true;
                break;
            }
        }
        if (!valido) {
            color = "blanco"; // Por defecto
        }
        return color;
    }

    // Método para calcular el precio final
    
    public double precioFinal() {
        int indiceConsumo = 0;
        for (int i = 0; i < letrasConsumoEnergetico.length; i++) {
            if (letrasConsumoEnergetico[i] == consumoEnergetico) {
                indiceConsumo = i;
                break;
            }
        }
        double precioFinal = precioBase + preciosConsumo[indiceConsumo];

        if (peso >= 0 && peso < 20) {
            precioFinal += preciosPorPeso[0];
        } else if (peso >= 20 && peso < 50) {
            precioFinal += preciosPorPeso[1];
        } else if (peso >= 50 && peso < 80) {
            precioFinal += preciosPorPeso[2];
        } else {
            precioFinal += preciosPorPeso[3];
        }

        return precioFinal;
    }
}