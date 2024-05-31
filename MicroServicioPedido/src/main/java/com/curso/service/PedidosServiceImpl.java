package com.curso.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidoDao;
import com.curso.model.Pedido;
import com.curso.model.Producto;

@Service
public class PedidosServiceImpl implements PedidosService {

	@Autowired
	PedidoDao dao;
	@Autowired
	RestTemplate template;

	private static final String URL_PRODUCTOS = "http://localhost:8000/productos";

	@Override
	public List<Pedido> listar() {

		return dao.findAll();
	}

	@Override
	public Optional<Pedido> buscar(Integer idPedido) {

		return dao.findById(idPedido);
	}

	@Override
	public List<Pedido> eliminarPedido(Integer idPedido) {
		dao.deleteById(idPedido);
		return listar();
	}

	@Override
	public List<Pedido> comprobarPedido(Pedido pedido) {
		Producto prod = obtenerProducto(pedido.getNombreProducto());

		if (pedido.getUnidades() <= prod.getStock()) {

			realizarPedido(pedido, prod);
		}

		return dao.findAll();
	}

	private void realizarPedido(Pedido pedido, Producto prod) {
		prod.setStock(prod.getStock() - pedido.getUnidades());
		template.put(URL_PRODUCTOS, prod);
		pedido.setPrecioTotal(prod.getPrecioUnitario() * pedido.getUnidades());
		pedido.setFechaPedido(LocalDate.now());
		dao.save(pedido);
	}

	private Producto obtenerProducto(String nombreProducto) {
		return template.getForObject(URL_PRODUCTOS + "/" + nombreProducto, Producto.class);
	}

}