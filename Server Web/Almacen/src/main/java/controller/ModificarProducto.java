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
        
        // Verificar si el valor de nuevoPrecioStr no es nulo antes de parsearlo
        if (nuevoPrecioStr != null && !nuevoPrecioStr.trim().isEmpty()) {
            // Convertir el nuevo precio a double solo si el valor no es nulo ni está vacío
            double nuevoPrecio = Double.parseDouble(nuevoPrecioStr);
            
            // Crear una instancia del servicio ProductoService
            ProductoService productoService = new ProductoService();
            
            // Llamar al método para modificar el precio del producto
            boolean modificado = productoService.modificarPrecio(nombreProducto, nuevoPrecio);
            
            // Redireccionar a la página de lista de productos
            if (modificado) {
                response.sendRedirect("listaproductos.jsp");
            } else {
                // Si no se pudo modificar, mostrar un mensaje de error
                response.getWriter().println("Error al modificar el precio del producto");
            }
        } else {
            // Si el valor de nuevoPrecioStr es nulo o vacío, mostrar un mensaje de error
            response.getWriter().println("Error: el nuevo precio no puede estar vacio");
        }
    }
}
