package com.curso.service;

import java.util.List;
import java.util.Optional;

import com.curso.model.Reserva;

public interface ReservasService {

	List<Reserva> listarReservas();
	Optional<Reserva> buscarReserva(int idReserva);
	void crearReserva(Reserva reserva);
	void actualizarReserva(Reserva reserva);
	List<Reserva> eliminarReserva(int idReserva);
	List<Reserva> buscarPorNombreDelHotel(String nombreHotel);

}
