package Prueba.com;

public class Main {
	
    public static void main(String[] args) {
    	
        Coche miCoche = new Coche("1234ABC", "Rojo");
        System.out.println("Matrícula: " + miCoche.getMatricula());
        System.out.println("Color: " + miCoche.getColor());
        System.out.println("Número de ruedas: " + miCoche.getNumeroRuedas());

        System.out.println("\n");
        miCoche.conducir();
        miCoche.avanzar();
        miCoche.retroceder();
        miCoche.parar();

        System.out.println("\n");
        miCoche.pintar("Azul");
        System.out.println("Nuevo color: " + miCoche.getColor());
    }
}