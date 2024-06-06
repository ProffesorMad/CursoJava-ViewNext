package com.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelDao;
import com.curso.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelDao hoteldao;

    @Override
    public List<Hotel> listar() {
        return hoteldao.findAll();
    }

    @Override
    public Optional<Hotel> buscar(Integer idHotel) {
        return hoteldao.findById(idHotel);
    }

    @Override
    public void crear(Hotel hotel) {
    	hoteldao.save(hotel);
    }

    @Override
    public void actualizar(Hotel hotel) {
    	hoteldao.save(hotel);
    }

    @Override
    public List<Hotel> eliminar(Integer idHotel) {
    	hoteldao.deleteById(idHotel);
        return listar();
    }

    @Override
    public Optional<Hotel> buscarPorNombre(String nombre) {
        return hoteldao.findByNombre(nombre);
    }

    @Override
    public List<Hotel> listarDisponibles() {
        return hoteldao.findByDisponibleTrue();
    }
    
    @Override
    public List<Hotel> buscarPorCategoria(String categoria) {
        return hoteldao.findByCategoria(categoria);
    }
}
