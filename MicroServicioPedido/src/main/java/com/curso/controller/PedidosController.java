package com.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;
import com.curso.service.PedidosService;

@RestController
public class PedidosController {

	@Autowired
	PedidosService service;

	// http://localhost:7000/pedidos
	@GetMapping(value = "pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Pedido> listar() {

		return service.listar();
	}

	// http://localhost:7000/pedidos/1
	@GetMapping(value = "pedidos/{idPedido}", produces = MediaType.APPLICATION_JSON_VALUE)
	Optional<Pedido> buscar(@PathVariable("idPedido") Integer idPedido) {
		return service.buscar(idPedido);

	}

	/* http://localhost:7000/pedidos {"comprador": "Luis Martinez","nombre_producto": "Microondas","unidades": 2,"fecha_pedido": "2024-06-01","precio_total": 160.00} */
	@PostMapping(value = "pedidos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	List<Pedido> crearPedido(@RequestBody Pedido pedido) {
	    if (pedido.getNombreProducto() == null) {
	        throw new IllegalArgumentException("El nombre del producto no puede ser nulo");
	    }
	    return service.comprobarPedido(pedido);
	}


	// http://localhost:7000/pedidos/3
	@DeleteMapping(value = "pedidos/{idPedido}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Pedido> eliminarPedido(@PathVariable("idPedido") Integer idPedido) {
		return service.eliminarPedido(idPedido);
	}
}