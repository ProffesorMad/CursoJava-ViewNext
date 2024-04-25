package GestionBiblioteca.com;

import java.util.ArrayList;
import java.util.List;

public class Socio extends Usuario {
	
    private List<Documento> documentosPrestados;

    public Socio(String dni, String nombre) {
        super(dni, nombre);
        this.documentosPrestados = new ArrayList<>();
    }

    // Métodos para gestionar préstamos, devoluciones y límites
}
