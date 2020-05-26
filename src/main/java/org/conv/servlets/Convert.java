package org.conv.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.converter.convert.*;
import com.converter.db.Users;
import com.converter.dboperations.GetUsers;
import com.converter.dboperations.SetConv;

public class Convert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionLogin = (String) session.getAttribute("sessionLogin");
		GetUsers getUsers = new GetUsers();
		ArrayList<Users> users = getUsers.getUserByLogin(sessionLogin);
		int userId = users.get(0).getUserID();
		Frequency frequency = new Frequency();
		Mass mass = new Mass();
		SetConv setConv = new SetConv();
		String type = request.getParameter("select1");
		String valueName1 = request.getParameter("param1");
		String valueName2 = request.getParameter("param2");
		double value = Double.parseDouble(request.getParameter("text1"));
		double result = 0;
		if(type.equals("masa")) result = mass.convert(valueName1, valueName2, value);
		else if(type.equals("4astota")) result = frequency.convert(valueName1, valueName2, value);
		setConv.create(userId, valueName1, valueName2, value, result);
		request.setAttribute("selectParam", type);
		request.setAttribute("value2", result);
		request.setAttribute("value1", value);
		request.setAttribute("valueName1", valueName1);
		request.setAttribute("valueName2", valueName2);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
