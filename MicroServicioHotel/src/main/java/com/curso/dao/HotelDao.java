package com.curso.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {

    List<Hotel> findByDisponibleTrue();
    Optional<Hotel> findByNombre(String nombre);
}
