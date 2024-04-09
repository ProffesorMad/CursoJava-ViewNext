package Ejercicio1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    	
        List<Jugador> jugadores = crearJugadores();
  
        List<Equipo> equipos = crearEquipos();
        asignarPartidosGanados(equipos);
        ordenarEquiposPorPartidosGanados(equipos);
        mostrarEquipos(equipos);
        
        List<Partido> partidos = crearPartidos();
        mostrarPartidos(partidos);
        
        Map<String, List<Jugador>> jugadoresPorEquipo = agruparJugadoresPorEquipo(jugadores);
        mostrarJugadoresPorEquipoOrdenadosPorGoles(jugadoresPorEquipo);
        
    }

    private static List<Jugador> crearJugadores() {
        String[] nombresJugadores = {"Lionel Messi", "Karim Benzema", "Sergio Ramos", "Sergio Busquets",
                "Antoine Griezmann", "Luis Suarez", "Marco Asensio", "Eden Hazard", "Ansu Fati", "Jan Oblak",
                "Frenkie de Jong", "Toni Kroos", "Casemiro", "Jordi Alba", "Diego Costa", "Gerard Piqué",
                "Yannick Carrasco", "Lucas Vazquez", "Pedri", "Luka Modric", "Koke", "Ousmane Dembele"};

        String[] equipos = {"Barcelona", "Real Madrid", "Real Madrid", "Barcelona", "Atletico de Madrid",
                "Atletico de Madrid", "Real Madrid", "Real Madrid", "Barcelona", "Atletico de Madrid",
                "Barcelona", "Real Madrid", "Real Madrid", "Barcelona", "Atletico de Madrid", "Barcelona",
                "Atletico de Madrid", "Real Madrid", "Barcelona", "Real Madrid", "Atletico de Madrid", "Barcelona"};

        int[] goles = {30, 35, 15, 10, 57, 28, 12, 8, 11, 0, 9, 6, 7, 5, 6, 3, 9, 4, 7, 10, 6, 5};

        List<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < nombresJugadores.length; i++) {
            jugadores.add(new Jugador(nombresJugadores[i], equipos[i], goles[i]));
        }
        return jugadores;
    }


    private static List<Equipo> crearEquipos() {
        List<Equipo> equipos = new ArrayList<>();
        String[] nombresEquipos = {"Sevilla", "Atletico de Madrid", "Barcelona", "Real Madrid", "Betis", "Granada",
                "Villareal", "Real Sociedad", "Athletic", "Celta de Vigo", "Eibar", "Real Valladolid", "Alaves",
                "Levante", "Osasuna", "Cadiz", "Huesca", "Elche", "Getafe", "Valencia"};
        for (String nombreEquipo : nombresEquipos) {
            equipos.add(new Equipo(nombreEquipo, new ArrayList<>()));
        }
        return equipos;
    }

    private static void asignarPartidosGanados(List<Equipo> equipos) {
        int[] partidosGanados = {24, 26, 24, 25, 17, 13, 15, 17, 11, 14, 6, 5, 9, 9, 11, 11, 7, 8, 9, 10};
        for (int i = 0; i < equipos.size(); i++) {
            equipos.get(i).setPartidosGanados(partidosGanados[i]);
        }
    }

    private static void ordenarEquiposPorPartidosGanados(List<Equipo> equipos) {
        equipos.sort(Comparator.comparingInt(Equipo::getPartidosGanados).reversed());
    }

    private static void mostrarEquipos(List<Equipo> equipos) {
        System.out.println("Lista de equipos:");
        System.out.println("");
        for (Equipo equipo : equipos) {
            System.out.println("-" + equipo.getNombre() + " con " + equipo.getPartidosGanados() + " partidos ganados.");
        }
    }
    
    private static List<Partido> crearPartidos() {
        List<Partido> partidos = new ArrayList<>();
        String[] equiposLocal = {"Atletico de Madrid", "Real Madrid", "Barcelona", "Atletico de Madrid", "Real Madrid",
                "Barcelona", "Sevilla", "Sevilla", "Atletico de Madrid", "Atletico de Madrid", "Real Madrid",
                "Barcelona", "Sevilla", "Real Sociedad", "Real Madrid", "Barcelona", "Atletico de Madrid", "Sevilla",
                "Barcelona"};
        String[] equiposVisitante = {"Real Madrid", "Barcelona", "Atletico de Madrid", "Sevilla", "Sevilla", "Sevilla",
                "Real Madrid", "Barcelona", "Barcelona", "Real Sociedad", "Villareal", "Valencia", "Betis", "Barcelona",
                "Barcelona", "Real Madrid", "Sevilla", "Real Madrid", "Atletico de Madrid"};
        int[] golesLocal = {2, 2, 0, 2, 1, 3, 1, 0, 1, 2, 3, 4, 2, 2, 1, 2, 1, 2, 2};
        int[] golesVisitante = {1, 0, 1, 0, 0, 0, 1, 2, 0, 1, 1, 2, 0, 0, 1, 0, 3, 1, 1};

        for (int i = 0; i < equiposLocal.length; i++) {
            partidos.add(new Partido(equiposLocal[i], equiposVisitante[i], golesLocal[i], golesVisitante[i]));
        }
        return partidos;
    }

    
    private static void mostrarPartidos(List<Partido> partidos) {
        System.out.println("\n");
        System.out.println("Lista de partidos jugados con resultados:");
        System.out.println("");
        for (Partido partido : partidos) {
            System.out.println("-" + partido.getEquipoL() + " " + partido.golesL() + " - " +
                    partido.golesV() + " " + partido.getEquipoV());
        }
    }
    
    private static Map<String, List<Jugador>> agruparJugadoresPorEquipo(List<Jugador> jugadores) {
        Map<String, List<Jugador>> jugadoresPorEquipo = new HashMap<>();
        for (Jugador jugador : jugadores) {
            jugadoresPorEquipo.computeIfAbsent(jugador.getEquipo(), k -> new ArrayList<>()).add(jugador);
        }
        return jugadoresPorEquipo;
    }
    
    private static void mostrarJugadoresPorEquipoOrdenadosPorGoles(Map<String, List<Jugador>> jugadoresPorEquipo) {
        System.out.println("\n");
        System.out.println("Lista de jugadores:");
        for (Map.Entry<String, List<Jugador>> entry : jugadoresPorEquipo.entrySet()) {
            String equipo = entry.getKey();
            List<Jugador> jugadoresEquipo = entry.getValue();
            jugadoresEquipo.sort(Comparator.comparingInt(Jugador::getGoles).reversed());
            System.out.println("");
            System.out.println("Equipo: " + equipo);
            for (Jugador jugador : jugadoresEquipo) {
                System.out.println("  - Nombre: " + jugador.getNombre() + " con " + jugador.getGoles() +" goles");
            }
        }
    }

}
