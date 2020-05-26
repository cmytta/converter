package org.conv.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.converter.db.*;
import com.converter.dboperations.*;

public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		GetUsers getUsers = new GetUsers();
		SetUsers setUsers = new SetUsers();
		ArrayList<Users> users = getUsers.getUserByLogin(login);
		if (login.length() >= 5) {
			if (password.length() >= 6) {
				if (password.equals(password2)) {
					if (users.size() == 0) {
						setUsers.create(login, password);
						System.out.println("-_- Reg successful -_-");
						response.sendRedirect("/conv/SuccesfullRegistr");
					} else {
						System.out.println("-_- User exist -_-");
						response.sendRedirect("/conv/UserExist");
					}				
				} else {
					System.out.println("-_- Passwords missmatch -_-");
					response.sendRedirect("/conv/PasswordMismatch"); 
				}
			} else {
				System.out.println("-_- Invalid password -_-");
				response.sendRedirect("/conv/InvalidPassword"); 
			}
		} else {
			System.out.println("-_- Invalid login -_-");
			response.sendRedirect("/conv/InvalidLogin"); 
		}
	}
}
