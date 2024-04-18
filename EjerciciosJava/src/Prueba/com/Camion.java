package Prueba.com;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo {
	
    // Propiedad específica de camión
	
    private List<Integer> tacometro;

    public Camion(String matricula) {
        super(matricula);
        this.tacometro = new ArrayList<>();
    }

    // Getter y método para añadir velocidades al tacómetro
    
    public List<Integer> getTacometro() {
        return tacometro;
    }

    public void agregarVelocidadAlTacometro(int velocidad) {
        tacometro.add(velocidad);
    }
}

