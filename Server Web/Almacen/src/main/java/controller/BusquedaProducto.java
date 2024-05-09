package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.ProductoService;

import java.io.IOException;
import java.util.List;


public class BusquedaProducto extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la sección del producto del parámetro de solicitud
        String seccion = request.getParameter("seccion");
        
        // Crear una instancia del servicio ProductoService
        ProductoService productoService = new ProductoService();
        
        // Llamar al método para buscar productos por sección
        List<Producto> productos = productoService.buscarPorSeccion(seccion);
        
        // Colocar los resultados en el alcance de solicitud para mostrarlos en la página JSP
        request.setAttribute("productosEncontrados", productos);
        
        // Redireccionar a la página de resultados de búsqueda
        request.getRequestDispatcher("resultados_busqueda.jsp").forward(request, response);
    }
}
