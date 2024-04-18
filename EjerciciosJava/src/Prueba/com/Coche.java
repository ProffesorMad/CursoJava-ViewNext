package Prueba.com;

public class Coche extends Vehiculo implements Conducible {
	
    // Propiedades cambiables
	
    private String color;
    private int ruedas = 4; // Inmutable, todos los coches tienen 4 ruedas

    public Coche(String matricula, String color) {
        super(matricula);
        this.color = color;
    }

    // Getters y setters para el color (propiedad cambiable)
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Implementación de métodos del interfaz Conducible
    
    @Override
    public void conducir() {
        System.out.println("Conduciendo el coche...");
    }

    @Override
    public void avanzar(int distancia) {
        System.out.println("Avanzando " + distancia + " metros...");
    }

    @Override
    public void retroceder(int distancia) {
        System.out.println("Retrocediendo " + distancia + " metros...");
    }

    @Override
    public void parar() {
        System.out.println("El coche ha parado.");
    }

	@Override
	public String toString() {
		return "Coche de color " + color + " y con Matricula " + getMatricula();
	}

}
