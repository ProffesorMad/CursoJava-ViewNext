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

        String nombreProducto = request.getParameter("nombre");
        
        ProductoService productoService = new ProductoService();
        
        boolean eliminado = productoService.eliminarProducto(nombreProducto);
        
        if (eliminado) {
            response.sendRedirect("listaproductos.jsp");
        } else {
            response.getWriter().println("Error al eliminar el producto");
        }
    }
}
