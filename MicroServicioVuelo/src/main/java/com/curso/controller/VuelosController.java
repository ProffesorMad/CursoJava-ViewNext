package com.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelo;
import com.curso.service.VuelosService;


@RestController
public class VuelosController {

	@Autowired
	VuelosService service;

	@GetMapping(value = "vuelos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> listarVuelos() {
	    return service.listar();
	}

	@GetMapping(value = "vuelos/{idVuelo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Vuelo> buscarVuelo(@PathVariable("idVuelo") int idVuelo) {
	    return service.buscar(idVuelo);
	}

	@PostMapping(value = "vuelos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearVuelo(@RequestBody Vuelo vuelo) {
	    service.crear(vuelo);
	}

	@PutMapping(value = "vuelos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarVuelo(@RequestBody Vuelo vuelo) {
	    service.actualizar(vuelo);
	}

	@DeleteMapping(value = "vuelos/{idVuelo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> eliminarVuelo(@PathVariable("idVuelo") int idVuelo) {
	    return service.eliminar(idVuelo);
	}

	@GetMapping(value = "vuelos/disponibles/{plazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> buscarVuelosDisponibles(@PathVariable("plazas") int plazas) {
	    return service.buscarDisponibles(plazas);
	}

	@PutMapping(value = "vuelos/{idVuelo}/{plazas}")
	public void actualizarPlazasVuelo(@PathVariable("idVuelo") int idVuelo, @PathVariable("plazas") int plazas) {
	    service.actualizarPlazas(plazas, idVuelo);
	}
}
