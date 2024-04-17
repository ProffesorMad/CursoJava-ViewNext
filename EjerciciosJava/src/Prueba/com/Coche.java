package Prueba.com;

public class Coche extends Vehiculo implements Conducible {
	
    private String color;

    public Coche(String matricula, String color) {
        super(matricula, 4); // Todos los coches tienen 4 ruedas
        this.color = color;
    }

    // Getter
    
    public String getColor() {
        return color;
    }

    // Método para cambiar el color del coche
    
    public void pintar(String nuevoColor) {
        this.color = nuevoColor;
    }

    // Implementación de los métodos de la interfaz Conducible
    
    @Override
    public void conducir() {
        System.out.println("Conduciendo el coche");
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando el coche");
    }

    @Override
    public void retroceder() {
        System.out.println("Retrocediendo el coche");
    }

    @Override
    public void parar() {
        System.out.println("Parando el coche");
    }
}