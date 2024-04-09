package Ejercicio3;

public class Ordenador extends Producto {
    private String procesador;
    private int memoriaRAM;
    private int capacidadDiscoDuro;

    public Ordenador(int codigoProducto, String modelo, double precio, int cantidadDisponible, String procesador, int memoriaRAM, int capacidadDiscoDuro) {
        super(codigoProducto, modelo, precio, cantidadDisponible);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    @Override
    public String toString() {
        return  "CodigoProducto = " + getCodigoProducto() +
                "  Modelo = " + getModelo() + 
                "  Precio = " + getPrecio() +
                "  Cantidad Disponible= " + getCantidadDisponible() +
                "  Procesador = " + procesador + 
                "  Memoria RAM = " + memoriaRAM +
                "  Capacidad Disco Duro = " + capacidadDiscoDuro ;
    }
}
