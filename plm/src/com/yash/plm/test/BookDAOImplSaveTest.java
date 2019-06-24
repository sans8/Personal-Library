package com.yash.plm.test;

import com.yash.plm.dao.BookDAO;
import com.yash.plm.daoimpl.BookDAOImpl;
import com.yash.plm.model.Book;

public class BookDAOImplSaveTest {

	public static void main(String[] args) {
		BookDAO bookdao = new BookDAOImpl();
		Book book = new Book();
		book.setTitle("Java");
		book.setAuthor("Balaguruswami");
		book.setPrice(400);
		book.setPublisher("MaGraw Hill");
		book.setIsbn(123456l);
		//bookdao.save(book);
	}
}
