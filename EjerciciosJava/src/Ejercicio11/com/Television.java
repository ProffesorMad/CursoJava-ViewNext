package Ejercicio11.com;

public class Television extends Electrodomestico {
	
    // Atributos propios de la subclase Television
	
    private double resolucion; // en pulgadas
    private boolean sintonizadorTDT;

    // Constantes para valores por defecto
    
    private final double RESOLUCION_POR_DEFECTO = 20;
    private final boolean SINTONIZADOR_POR_DEFECTO = false;

    // Constructores
    
    // Constructor por defecto
    
    public Television() {
        super(); // Llama al constructor por defecto de la clase padre
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_POR_DEFECTO;
    }

    // Constructor con precio y peso, el resto por defecto
    
    public Television(double precioBase, double peso) {
        super(precioBase, peso); // Llama al constructor con precio y peso de la clase padre
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_POR_DEFECTO;
    }

    // Constructor con resolución, sintonizador TDT y el resto de atributos heredados
    
    public Television(double resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso); // Llama al constructor con todos los atributos de la clase padre
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Métodos get de resolución y sintonizador TDT
    
    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // Método para calcular el precio final
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); // Llama al método precioFinal de la clase padre

        // Si la resolución es mayor de 40 pulgadas, aumenta el precio un 30%
        
        if (resolucion > 40) {
            precioFinal *= 1.3;
        }

        // Si tiene sintonizador TDT incorporado, aumenta 50 €
        
        if (sintonizadorTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
