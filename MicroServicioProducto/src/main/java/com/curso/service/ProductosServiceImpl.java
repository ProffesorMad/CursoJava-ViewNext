package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ProductosDao;
import com.curso.model.Producto;

@Service
public class ProductosServiceImpl implements ProductosService {
    @Autowired
    ProductosDao dao;

    @Override
    public List<Producto> allProducts() {
        return dao.findAll();
    }

    @Override
    public Integer obtenerPrecioProducto(int codProd) {
        return dao.obtenerPrecioProducto(codProd);
    }

    @Override
    public Producto buscarProductosPorCodProd(Integer codProd) {
        return dao.buscarProductosPorCodProd(codProd);
    }

    @Override
    public List<Producto> buscarProductosPorStock(Integer stock) {
        return dao.buscarProductosPorStock(stock);
    }

    @Override
    public List<Producto> buscarProductosPorNombre(String nombre) {
        return dao.buscarProductosPorNombre(nombre);
    }

    @Override
    public void actualizarStockProducto(Integer codProd, Integer unidadesCompradas) {
        Producto producto = dao.findById(codProd).orElse(null);
        if (producto != null) {
            producto.setStock(producto.getStock() - unidadesCompradas);
            dao.save(producto);
        }
    }
}
