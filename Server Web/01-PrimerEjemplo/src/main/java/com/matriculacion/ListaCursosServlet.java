package com.matriculacion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ListaCursosServlet extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista de Cursos Disponibles</h1>");
        out.println("<ul>");
        out.println("<li>Curso de Programación Java</li>");
        out.println("<li>Curso de Desarrollo Web</li>");
        out.println("<li>Curso de Bases de Datos</li>");
        // Añadir más cursos si es necesario
        out.println("</ul>");
        out.println("<form action='/matricular' method='post'>");
        out.println("<input type='hidden' name='nombre' value='" + nombre + "'>");
        out.println("<input type='text' name='curso' placeholder='Nombre del curso'>");
        out.println("<input type='submit' value='Matricularse'>");
        out.println("</form>");
    }
}

