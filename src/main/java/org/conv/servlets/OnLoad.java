package org.conv.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("")
public class OnLoad extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionLogin = (String) session.getAttribute("sessionLogin");
		System.out.println("-_- " + sessionLogin + " -_-");
		if(sessionLogin != null) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);;
		} else {
			response.sendRedirect("/conv/login.jsp");
		}
	}
		
}