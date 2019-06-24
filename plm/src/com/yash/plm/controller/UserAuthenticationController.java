package com.yash.plm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.plm.model.User;
import com.yash.plm.service.UserService;
import com.yash.plm.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class UserAuthenticationController
 */
@WebServlet("/UserAuthenticationController")
public class UserAuthenticationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = new UserServiceImpl();
		HttpSession session = request.getSession(true);
		User user = userService.getUser(request.getParameter("userName"),request.getParameter("password"));
		if(user!=null)	{
			
			session.setAttribute("User", user);
			getServletContext().getRequestDispatcher("/view/Home.jsp").forward(request, response);
		}
		else	{
			session.setAttribute("errMsg","Authentication failed.");
			getServletContext().getRequestDispatcher("/view/UserLogin.jsp").forward(request, response);
		}
	}

}
