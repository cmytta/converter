package org.conv.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.converter.db.Conv;
import com.converter.db.Users;
import com.converter.dboperations.GetConv;
import com.converter.dboperations.GetUsers;


public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	String sessionLogin = (String) session.getAttribute("sessionLogin");
	if(sessionLogin != null) {
	GetUsers getUsers = new GetUsers();
	ArrayList<Users> users = getUsers.getUserByLogin(sessionLogin);
	int userId = users.get(0).getUserID();
	GetConv getConv = new GetConv();
	ArrayList<Conv> conv = getConv.getConvByUserID(userId);
	request.setAttribute("convert", conv);
	request.getRequestDispatcher("/Profile.jsp").forward(request, response);
		}
	else {
		response.sendRedirect("/conv/login.jsp");
		}
	}
}
