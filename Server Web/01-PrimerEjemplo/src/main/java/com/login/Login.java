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
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("NombreUsuario");
		String password = request.getParameter("ContrasenaUsuario");
		

		if(password.equalsIgnoreCase("cursojava")) {
			Usuario usuario = new Usuario(nombre, password);
			HttpSession session= request.getSession(true);
			session.setAttribute("Usuario", usuario);
			
			RequestDispatcher rd  = request.getRequestDispatcher("Registrar"); 
			rd.forward(request, response);
		
			
		}
		else {
			PrintWriter out = response.getWriter();
			out.print("Contrasena incorrecta por favor Introduzcala de nuevo");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
            rd.include(request, response);
		}

	}

}
