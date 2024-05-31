package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Producto;

public interface ProductosDao extends JpaRepository<Producto, Integer> {

    @Query("SELECT p FROM Producto p WHERE p.codProd = :codProd")
    Producto buscarProductosPorCodProd(@Param("codProd") Integer codProd);

    @Query("SELECT p FROM Producto p WHERE p.stock = :stock")
    List<Producto> buscarProductosPorStock(@Param("stock") Integer stock);

    @Query("SELECT p FROM Producto p WHERE p.nombre LIKE %:nombre%")
    List<Producto> buscarProductosPorNombre(@Param("nombre") String nombre);

    @Query("SELECT p.precio FROM Producto p WHERE p.codProd = :codProd")
    Integer obtenerPrecioProducto(@Param("codProd") Integer codProd);
}
