package com.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VuelosDao;
import com.curso.model.Vuelo;

@Service
public class VuelosServiceImpl implements VuelosService {

	@Autowired
	VuelosDao vuelosdao;
	
	@Override
	public List<Vuelo> listar() {	
	    return vuelosdao.findAll();
	}

	@Override
	public Optional<Vuelo> buscar(int idVuelo) {
	    return vuelosdao.findById(idVuelo);
	}

	@Override
	public void crear(Vuelo vuelo) {
	    vuelosdao.save(vuelo);
	}

	@Override
	public void actualizar(Vuelo vuelo) {
	    vuelosdao.save(vuelo);
	}

	@Override
	public List<Vuelo> eliminar(int idVuelo) {
	    vuelosdao.deleteById(idVuelo);
	    return listar();
	}

	@Override
	public List<Vuelo> buscarDisponibles(int plazas) {
	    return vuelosdao.findByPlazasDisponiblesGreaterThanEqual(plazas);
	}

	@Override
	public void actualizarPlazas(int reservadas, int idVuelo) {	
	    vuelosdao.actualizaPlazasDisponibles(reservadas, idVuelo);
	}


}
