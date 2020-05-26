package org.conv.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InvalidLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean invalidLogin = true;
		request.setAttribute("invalidLogin", invalidLogin);
		getServletContext().getRequestDispatcher("/reg.jsp").forward(request, response);
	}

}
