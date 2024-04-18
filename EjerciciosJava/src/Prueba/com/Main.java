package Prueba.com;

import java.util.List;

public class Main {
	
    public static void main(String[] args) {
    	
        Coche miCoche = new Coche("1233ABC", "Rojo");
        miCoche.conducir();
        miCoche.avanzar(10);
        miCoche.parar();

        Camion miCamion = new Camion("4561DEF");
        miCamion.agregarVelocidadAlTacometro(50);
        miCamion.agregarVelocidadAlTacometro(60);
        List<Integer> velocidades = miCamion.getTacometro();
        System.out.println("\nVelocidades registradas en el tacómetro del camión: " + velocidades);
    }
}