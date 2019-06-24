package com.yash.plm.test;

import com.yash.plm.dao.BookDAO;
import com.yash.plm.daoimpl.BookDAOImpl;
import com.yash.plm.model.Book;

public class BookDAOImplUpdateTest {

	public static void main(String[] args) {
		BookDAO bookdao = new BookDAOImpl();
		Book book = new Book();
		book.setTitle("C++");
		book.setAuthor("Balaguruswami");
		book.setPrice(400);
		book.setPublisher("MaGraw Hill");
		book.setIsbn(123456l);
		//bookdao.update(book);
	}
}
