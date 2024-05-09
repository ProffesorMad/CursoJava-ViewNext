<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista productos</title>
</head>
<body>
    <h2></h2>
    <%@ page import="service.ProductoService" %>
    <%@ page import="model.Producto" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
    <% 
        ProductoService service = new ProductoService();
        List<Producto> listaProducto= new ArrayList<>();
        listaProducto = service.getListaProductos();
    %>
    <table border="1">
        <tr>
            <th>Nombre del producto</th>
            <th>Sección</th>
            <th>Precio</th>
            <th>Stock</th>
        </tr>
        <% for(Producto prod : listaProducto){%>
        <tr>
            <td><%=prod.getNomProducto()%></td>
            <td><%=prod.getSeccion() %></td>
            <td><%=prod.getPrecio() %></td>
            <td><%=prod.getStock() %></td>
        </tr>
        <% } %>
    </table>
    <br>
    <a href="busquedaproducto.html">Buscar Producto</a><br>
    <a href="altaproducto.html">Dar de Alta Un Objeto</a><br>
    <a href="modificarproducto.html">Subir Los Precios</a><br>
    <a href="eliminarproducto.html">Eliminar Un Producto</a><br>
</body>
</html>
