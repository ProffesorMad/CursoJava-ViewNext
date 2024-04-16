package Ejercicio01.com;
import java.util.List;

public class Equipo {
	
	private String nombre;
	private List<Jugador> jugadores;
	private int partidosGanados;
	
	public Equipo(String nombre, List<Jugador> jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	
}
