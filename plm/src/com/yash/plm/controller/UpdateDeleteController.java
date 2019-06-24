package com.yash.plm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateDeleteController
 */
@WebServlet("/UpdateDeleteController")
public class UpdateDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("update")!=null)	{
			request.setAttribute("selectedIsbn",request.getParameter("update"));
			System.out.println(request.getAttribute("selectedIsbn"));
			getServletContext().getRequestDispatcher("/UpdateBookFormController").forward(request,response);
		}
		else if(request.getParameter("delete")!=null) {
			request.setAttribute("selectedIsbn",request.getParameter("delete"));
			getServletContext().getRequestDispatcher("/DeleteBookController").forward(request,response);
		}
		else if(request.getParameter("deleteSelected")!=null){
			String[] isbnList = request.getParameterValues("select");
			request.setAttribute("isbnList", isbnList);
			getServletContext().getRequestDispatcher("/DeleteSelectedBookController").forward(request,response);
		}
		else	{
			getServletContext().getRequestDispatcher("/ExcelReportController").forward(request,response);
		}
	}
}
