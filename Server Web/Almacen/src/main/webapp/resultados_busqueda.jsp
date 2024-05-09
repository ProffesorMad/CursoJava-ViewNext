<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultados de Búsqueda</title>
</head>
<body>
    <h2>Resultados de Búsqueda por Sección</h2>
    
    <%@ page import="service.ProductoService" %>
    <%@ page import="model.Producto" %>
    <%@ page import="java.util.List" %>
    <% 
        String seccionBuscada = request.getParameter("seccion");
        ProductoService productoService = new ProductoService();
        List<Producto> productosEncontrados = productoService.buscarPorSeccion(seccionBuscada);
    %>
    
    
    <% if (!productosEncontrados.isEmpty()) { %>
        <table border="1">
            <tr>
                <th>Nombre del Producto</th>
                <th>Sección</th>
                <th>Precio</th>
                <th>Stock</th>
            </tr>
            <% for (Producto producto : productosEncontrados) { %>
                <tr>
                    <td><%= producto.getNomProducto() %></td>
                    <td><%= producto.getSeccion() %></td>
                    <td><%= producto.getPrecio() %></td>
                    <td><%= producto.getStock() %></td>
                </tr>
            <% } %>
        </table>
    <% } else { %>
        <p>No se encontraron productos para la sección <%= seccionBuscada %>.</p>
    <% } %>
    
    <br>
    <a href="index.html">Volver al Inicio</a>
</body>
</html>
