package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet01
 */
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Hola buenas: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang = \"es\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title>Intro Cyberpunk 2077</title>");
		out.println("</head>");
		out.println("<body>");
		//for (int = 0; i < 3; i++){
			//out.println("Hola mundo<br>")}
		out.println("BUEEEEEEEEEEEEEEENOS DÍAS, NIGHT CITY.<br>"
				+ "La loteria de muertos de ayer ha ascendido ya hasta los 30: 10 son de Heywood, gracias a las interminables guerras de bandas.<br>"
				+ "¡Ha caído un agente, lo que significa que la habéis hecho buena! La poli de Night City no lo dejará pasar.<br>"
				+ "Y en Santo Domingo otro apagón gracias a los netrunners que hacen de las suyas en el suministro eléctrico.<br>"
				+ "Mienstras tanto en Westbrook los de Tauma team despegan del suelo a las víctimas de los ciberpscicópatas.<br>"
				+ "Y en Pacifica, bueno... Pacifica sigue siendo Pacifica.<br>");
		out.println("</body>");
		out.println("</html>");
		out.close();;
	}


}
