package GestionBiblioteca.com;

import java.util.ArrayList;
import java.util.List;

public class UsuarioOcasional extends Usuario {
	
    private List<Documento> documentosPrestados;

    public UsuarioOcasional(String dni, String nombre) {
        super(dni, nombre);
        this.documentosPrestados = new ArrayList<>();
    }

    // Métodos para gestionar préstamos, devoluciones y límites
}