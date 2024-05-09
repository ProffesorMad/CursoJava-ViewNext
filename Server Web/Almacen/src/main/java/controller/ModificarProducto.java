package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ProductoService;

import java.io.IOException;


public class ModificarProducto extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreProducto = request.getParameter("nombre");
        String nuevoPrecioStr = request.getParameter("nuevoPrecio");
        
        if (nuevoPrecioStr != null && !nuevoPrecioStr.trim().isEmpty()) {
        	
            double nuevoPrecio = Double.parseDouble(nuevoPrecioStr);
            
            ProductoService productoService = new ProductoService();
            
            boolean modificado = productoService.modificarPrecio(nombreProducto, nuevoPrecio);
            
            if (modificado) {
                response.sendRedirect("listaproductos.jsp");
            } else {
                response.getWriter().println("Error al modificar el precio del producto");
            }
        } else {
            response.getWriter().println("Error: el nuevo precio no puede estar vacio");
        }
    }
}
