package com.yash.plm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("errMsg", " ");
		if(request.getParameter("view")==null)	{
			getServletContext().getRequestDispatcher("/view/AddBook.jsp").forward(request,response);
		}
		else {
			getServletContext().getRequestDispatcher("/ListBookController").forward(request,response);
		}
	}

}
