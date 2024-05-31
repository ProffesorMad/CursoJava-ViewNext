package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductosService {

    List<Producto> allProducts();

    Integer obtenerPrecioProducto(int codProd);

    Producto buscarProductosPorCodProd(Integer codProd);

    List<Producto> buscarProductosPorStock(Integer stock);

    List<Producto> buscarProductosPorNombre(String nombre);

    void actualizarStockProducto(Integer codProd, Integer unidadesCompradas);
}
