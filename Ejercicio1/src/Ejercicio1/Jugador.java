package Ejercicio1;
public class Jugador {

	private String nombre;
	private String equipo;
	private int goles;
	
	public Jugador(String nombre, String equipo, int goles) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.goles = goles;
	}

	public String getNombre() {
		return nombre;
	}

	public int getGoles() {
		return goles;
	}

	public String getEquipo() {
		return equipo;
	}
	
}
