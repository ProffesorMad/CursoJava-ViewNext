package com.curso.service;

import java.util.List;
import java.util.Optional;

import com.curso.model.Pedido;

public interface PedidosService {

	List<Pedido> listar();
	
	List<Pedido> comprobarPedido(Pedido pedido);

	Optional<Pedido> buscar(Integer idPedido);

	List<Pedido> eliminarPedido(Integer idPedido);
}