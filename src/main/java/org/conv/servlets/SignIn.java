package org.conv.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.converter.db.*;
import com.converter.dboperations.*;

public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		GetUsers getUsers = new GetUsers();
		ArrayList<Users> users = getUsers.getUserByLogin(login);
		if (users.size() > 0) {
			if (users.get(0).getPassword().equals(password)) {
				session.setAttribute("sessionLogin", login);
				System.out.println("-_- " + session.getAttribute("sessionLogin") + " -_-");
				response.sendRedirect("/conv/");
			} else {
				System.out.println("-_- Wrong password -_-");
				response.sendRedirect("/conv/WrongLoginOrPassword");
			}
		} else {
			System.out.println("-_- Wrong login -_-");
			response.sendRedirect("/conv/WrongLoginOrPassword");
		}
	}
}