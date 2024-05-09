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
 
        String seccion = request.getParameter("seccion");
        
        ProductoService productoService = new ProductoService();
        
        List<Producto> productos = productoService.buscarPorSeccion(seccion);
        
        request.setAttribute("productosEncontrados", productos);
        
        request.getRequestDispatcher("resultados_busqueda.jsp").forward(request, response);
    }
}
