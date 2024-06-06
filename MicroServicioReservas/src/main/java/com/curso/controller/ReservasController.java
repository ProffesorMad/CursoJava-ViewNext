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

import com.curso.model.Reserva;
import com.curso.service.ReservasService;

@RestController
public class ReservasController {

	@Autowired
	ReservasService service;

	// http://localhost:9000/reservas
	@GetMapping(value = "reservas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> listar() {
		return service.listarReservas();
	}

	// http://localhost:9000/reservas/3
	@GetMapping(value = "reservas/{idReserva}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Reserva> buscar(@PathVariable("idReserva") int idReserva) {
		return service.buscarReserva(idReserva);
	}

	// http://localhost:9000/reservas {"idVuelo": 2,"idHotel": 3,"nombreCliente": "Pablo Gracia","dni": "25355541L","numeroPersonas": 3}
	@PostMapping(value = "reservas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crear(@RequestBody Reserva reserva) {
		service.crearReserva(reserva);
	}

	// http://localhost:9000/reservas {"idReserva": 2,"nombreCliente": "Mari Carmen","dni": "87654321B","numeroPersonas": 2,"idVuelo": 2,"idHotel": 3}
	@PutMapping(value = "reservas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizar(@RequestBody Reserva reserva) {
		service.actualizarReserva(reserva);
	}

	// http://localhost:9000/reservas/1
	@DeleteMapping(value = "reservas/{idReserva}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> eliminar(@PathVariable("idReserva") int idReserva) {
		return service.eliminarReserva(idReserva);
	}

	// http://localhost:9000/reservas/hotel/Hotel%20Encanto%20Tropical
	@GetMapping(value = "reservas/hotel/{nombreHotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> buscarPorNombreHotel(@PathVariable("nombreHotel") String nombreHotel) {
		return service.buscarPorNombreDelHotel(nombreHotel);
	}

}
