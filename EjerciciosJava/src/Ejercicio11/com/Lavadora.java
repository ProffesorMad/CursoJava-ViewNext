package Ejercicio11.com;

public class Lavadora extends Electrodomestico {
	
    // Atributo propio de la subclase Lavadora
	
    private double carga;
    // Constante para la carga por defecto
    
    private final double CARGA_POR_DEFECTO = 5;

    // Constructores
    
    // Constructor por defecto
    
    public Lavadora() {
        super(); // Llama al constructor por defecto de la clase padre
        this.carga = CARGA_POR_DEFECTO;
    }

    // Constructor con precio y peso, el resto por defecto
    
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso); // Llama al constructor con precio y peso de la clase padre
        this.carga = CARGA_POR_DEFECTO;
    }

    // Constructor con carga y el resto de atributos heredados
    
    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso); // Llama al constructor con todos los atributos de la clase padre
        this.carga = carga;
    }

    // Método get de carga
    
    public double getCarga() {
        return carga;
    }

    // Método para calcular el precio final
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); // Llama al método precioFinal de la clase padre

        // Si la carga es mayor de 30 kg, aumenta el precio en 50 €
        
        if (carga > 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
