package com.yash.plm.test;

import java.util.List;

import com.yash.plm.dao.BookDAO;
import com.yash.plm.daoimpl.BookDAOImpl;
import com.yash.plm.model.Book;

public class BookDAOImplFindAllTest {

	public static void main(String[] args) {
		BookDAO bookdao = new BookDAOImpl();
		List<Book> books=null;
		//books = bookdao.findAll();
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
