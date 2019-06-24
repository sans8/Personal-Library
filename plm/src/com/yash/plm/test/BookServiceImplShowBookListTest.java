package com.yash.plm.test;

import java.util.List;

import com.yash.plm.model.Book;
import com.yash.plm.service.BookService;
import com.yash.plm.serviceimpl.BookServiceImpl;

public class BookServiceImplShowBookListTest {

	public static void main(String[] args) {
		BookService bookservice = new BookServiceImpl();
		List<Book> books=null;
		//books = bookservice.showBookList();
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
