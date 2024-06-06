package com.curso.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservasDao;
import com.curso.model.Hotel;
import com.curso.model.Reserva;
import com.curso.model.Vuelo;

@Service
public class ReservasServiceImpl implements ReservasService {

	@Autowired
	ReservasDao reservasdao;
	@Autowired
	RestTemplate template;
	
	private static final String URL_HOTEL = "http://localhost:8000/hoteles";
	private static final String URL_VUELO = "http://localhost:8080/vuelos";

	@Override
	public List<Reserva> listarReservas() {
	    return reservasdao.findAll();
	}

	@Override
	public Optional<Reserva> buscarReserva(int idReserva) {
	    return reservasdao.findById(idReserva);
	}
	
	@Override
	public void crearReserva(Reserva reserva) {
		boolean vueloDisponible = false;
		System.out.println(reserva);
		List<Vuelo> listaVuelos = Arrays.asList(
				template.getForObject(URL_VUELO + "/disponibles/" + reserva.getNumeroPersonas(), Vuelo[].class));
		for (Vuelo vuelo : listaVuelos) {
			if (vuelo.getIdVuelo() == reserva.getIdVuelo()) {
				vueloDisponible = true;
				template.put(URL_VUELO + "/" + vuelo.getIdVuelo() + "/" + reserva.getNumeroPersonas(), null);
			}
		}
		if (vueloDisponible) {
			reservasdao.save(reserva);
		}
	}

	@Override
	public void actualizarReserva(Reserva reserva) {
		reservasdao.save(reserva);
	}

	@Override
	public List<Reserva> eliminarReserva(int idReserva) {
	    reservasdao.deleteById(idReserva);
	    return listarReservas();
	}
	
	@Override
	public List<Reserva> buscarPorNombreDelHotel(String nombreHotel) {
		Hotel hotel = template.getForObject(URL_HOTEL + "/nombre/" + nombreHotel, Hotel.class);

		return reservasdao.findByIdHotel(hotel.getIdHotel());
	}

}
