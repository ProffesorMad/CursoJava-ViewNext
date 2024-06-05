package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
    List<Hotel> findByDisponibleTrue();
    Optional<Hotel> findByNombre(String nombre);
}