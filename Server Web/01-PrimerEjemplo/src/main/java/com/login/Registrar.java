package com.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistrarCursos
 */
public class Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("Usuario");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang = \"es\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		out.println(usuario.getNombre()+ " escribe un curso que quieras.");
		out.println("</p><p></p>");
		out.println("<form action=\"Cursos\" method=\"post\">");
		out.println("Nombre del curso :<input type=\"text\" name=\"cursoName\"><br>");
		out.println("</p><p></p>");
		out.println("<input type=\"submit\" value=\"Aceptar\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}