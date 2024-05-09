package controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ProductoService;

import java.io.IOException;


public class EliminarProducto extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener el nombre del producto a eliminar del parámetro de solicitud
        String nombreProducto = request.getParameter("nombre");
        
        // Crear una instancia del servicio ProductoService
        ProductoService productoService = new ProductoService();
        
        // Llamar al método para eliminar el producto
        boolean eliminado = productoService.eliminarProducto(nombreProducto);
        
        // Redireccionar a la página de lista de productos
        if (eliminado) {
            response.sendRedirect("listaproductos.jsp");
        } else {
            // Si no se pudo eliminar, mostrar un mensaje de error
            response.getWriter().println("Error al eliminar el producto");
        }
    }
}
