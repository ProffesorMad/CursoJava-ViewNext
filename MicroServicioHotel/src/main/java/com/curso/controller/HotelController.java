package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Hotel;
import com.curso.repository.HotelRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hoteles")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/disponibles")
    public List<Hotel> getHotelesDisponibles() {
        return hotelRepository.findByDisponibleTrue();
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Hotel> getHotelByName(@PathVariable String nombre) {
        Optional<Hotel> hotel = hotelRepository.findByNombre(nombre);
        if (hotel.isPresent()) {
            return ResponseEntity.ok(hotel.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}