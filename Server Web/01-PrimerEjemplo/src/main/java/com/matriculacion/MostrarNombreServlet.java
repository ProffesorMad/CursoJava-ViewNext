package com.matriculacion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MostrarNombreServlet extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        String nombre = (String) request.getAttribute("nombre");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Bienvenido, " + nombre + "!</h1>");
        response.getWriter().println("<a href='/listaCursos'>Matricularse en un curso</a>");
        
    }
}
