package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ListaCursos
 */
public class Cursos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("Usuario");
		String curso = request.getParameter("cursoName");
		List<String> listaCursos = usuario.getListaCursos();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang = \"es\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		if(usuario.addCursoToList(curso)) {
			out.println("Curso Insertado");
		}
		else {
			out.println("Por Favor Inserte un Curso en el Formulario");
		}
		out.println("</p><p></p>");
		if(listaCursos.isEmpty()) {
			out.println("El usuario "+ usuario.getNombre()+" no tiene ningun curso registrado ");
		}
		else {
			out.println("<h2>Cursos</h2>");
			out.println("<ul>");
			for(String curso1 : listaCursos ) {
				out.println("<li>"+ curso1 + "</li>");
			}
			out.println("</ul>");

		}


		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
