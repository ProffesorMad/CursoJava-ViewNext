package com.curso.service;

import java.util.List;
import java.util.Optional;

import com.curso.model.Vuelo;

public interface VuelosService {

	List<Vuelo> listar();
	Optional<Vuelo> buscar(int idVuelo);
	void crear(Vuelo vuelo);
	void actualizar(Vuelo vuelo);
	List<Vuelo> eliminar(int idVuelo);
	List<Vuelo> buscarDisponibles(int plazas);
	void actualizarPlazas(int reservadas, int idVuelo);
}
