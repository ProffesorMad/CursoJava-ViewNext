package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductosService;

@RestController
public class ProductosController {

    @Autowired
    ProductosService service;

    // http://localhost:8000/productos
    @GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> allProducts() {
        return service.allProducts();
    }

    // http://localhost:8000/productos/codigo/11
    @GetMapping(value = "productos/codigo/{codProd}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Producto buscarProductosPorCodProd(@PathVariable Integer codProd) {
        return service.buscarProductosPorCodProd(codProd);
    }

    // http://localhost:8000/productos/stock/50
    @GetMapping(value = "productos/stock/{stock}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> buscarProductosPorStock(@PathVariable Integer stock) {
        return service.buscarProductosPorStock(stock);
    }
    
    // http://localhost:8000/productos/nombre?nombre=producto
    @GetMapping(value = "productos/nombre", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> buscarProductosPorNombre(@RequestParam String nombre) {
        return service.buscarProductosPorNombre(nombre);
    }
    
    // http://localhost:8000/productos/3/1000
    @PutMapping(value = "productos/{codProd}/{unidadesCompradas}")
    public void actualizarStockProducto(@PathVariable Integer codProd, @PathVariable Integer unidadesCompradas) {
        service.actualizarStockProducto(codProd, unidadesCompradas);
    }
    
    // http://localhost:8000/productos/precio/7
    @GetMapping(value = "productos/precio/{codProd}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer obtenerPrecioProducto(@PathVariable Integer codProd) {
        return service.obtenerPrecioProducto(codProd);
    }
}
