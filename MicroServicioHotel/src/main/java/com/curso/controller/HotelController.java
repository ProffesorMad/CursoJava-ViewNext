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

import com.curso.model.Hotel;
import com.curso.service.HotelService;

@RestController
public class HotelController {

    @Autowired
    HotelService service;
    
    // http://localhost:8080/hoteles
    @GetMapping(value = "hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> listar() {
        return service.listar();
    }

    // http://localhost:8080/hoteles/1
    @GetMapping(value = "hoteles/{idHotel}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Hotel> buscarPorId(@PathVariable("idHotel") Integer idHotel) {
        return service.buscar(idHotel);
    }

    // http://localhost:8080/hoteles  {"nombre": "Hotel Ejemplo","categoria": "3 estrellas","precio": 100.00,"disponible": true}
    @PostMapping(value = "hoteles", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void crear(@RequestBody Hotel hotel) {
        service.crear(hotel);
    }

    // http://localhost:8080/hoteles  {"idHotel": 1, "nombre": "Hotel Gran Vista","categoria": "5 estrellas","precio": 100.00,"disponible": true}
    @PutMapping(value = "hoteles", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@RequestBody Hotel hotel) {
        service.actualizar(hotel);
    }

    // http://localhost:8080/hoteles/3
    @DeleteMapping(value = "hoteles/{idHotel}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> eliminar(@PathVariable("idHotel") Integer idHotel) {
        return service.eliminar(idHotel);
    }

    // http://localhost:8080/hoteles/disponibles
    @GetMapping(value = "hoteles/disponibles", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> listarDisponibles() {
        return service.listarDisponibles();
    }

    // http://localhost:8080/hoteles/nombre/Hotel%20Encanto%20Tropical
    @GetMapping(value = "hoteles/nombre/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Hotel> buscarPorNombre(@PathVariable("nombre") String nombre) {
        return service.buscarPorNombre(nombre);
    }
    
    // http://localhost:8080/hoteles/categoria/3%20estrellas
    @GetMapping(value = "hoteles/categoria/{categoria}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> buscarPorCategoria(@PathVariable("categoria") String categoria) {
        return service.buscarPorCategoria(categoria);
    }
    
}
