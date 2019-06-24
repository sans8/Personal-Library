package com.yash.plm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.plm.exception.UserException;
import com.yash.plm.model.User;
import com.yash.plm.service.UserService;
import com.yash.plm.serviceimpl.UserServiceImpl;
    
/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			User user= new User();
			user.setName(request.getParameter("name"));
			user.setLoginName(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			UserService userservcie = new UserServiceImpl();
			HttpSession session = request.getSession(true);
			try {
				userservcie.add(user);
				session.setAttribute("User", user);
				getServletContext().getRequestDispatcher("/view/Home.jsp").forward(request, response);
			} 
			catch (UserException e) {
				session.setAttribute("errMsg","Already Registered.");
//				getServletContext().getRequestDispatcher("/view/Registration.jsp").forward(request, response);
				response.sendRedirect("view/Registration.jsp");
			}
			
	}

}
