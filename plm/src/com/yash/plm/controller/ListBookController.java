package com.yash.plm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.plm.model.Book;
import com.yash.plm.model.User;
import com.yash.plm.service.BookService;
import com.yash.plm.serviceimpl.BookServiceImpl;

/**
 * Servlet implementation class ListBookController
 */
@WebServlet("/ListBookController")
public class ListBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService bookservice = new BookServiceImpl();
		List<Book> books=null;
		HttpSession session = request.getSession(true);
		User user= (User)session.getAttribute("User");
		books=bookservice.showBookList(user.getId());
		request.setAttribute("books", books);
		session.setAttribute("books", books);
		getServletContext().getRequestDispatcher("/view/ListBooks.jsp").forward(request, response);
	}
}
