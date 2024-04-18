package Prueba.com;

import java.util.List;

public class Main {
	
    public static void main(String[] args) {
    	
        Coche miCoche = new Coche("1233ABC", "Rojo");
        System.out.println(miCoche.toString());
        miCoche.conducir();
        miCoche.avanzar(10);
        miCoche.parar();

        Camion miCamion = new Camion("4561DEF");
        miCamion.agregarVelocidadAlTacometro(50);
        miCamion.agregarVelocidadAlTacometro(60);
        System.out.println("\n" + miCamion.toString());
    }
}