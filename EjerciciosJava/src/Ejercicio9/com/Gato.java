package Ejercicio9.com;

public class Gato extends Animal {
	
    private String nombre;

    public Gato() {
        super(4);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void comer() {
        System.out.println("A los gatos les gusta comer peces y arañas.");
    }

    public void jugar() {
        System.out.println("A " + nombre + " le gusta jugar con pelotas.");
    }
}