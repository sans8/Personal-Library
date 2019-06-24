package com.yash.plm.service;

import java.util.List;

import com.yash.plm.exception.BookException;
import com.yash.plm.model.Book;

/**
 * BookService interface declares methods to implement business logics.
 */
public interface BookService {
	/**
	 * addBook() method restricts duplicate entries in the database
	 * if there exists a book with same isbn number,
	 * a book exception is thrown
	 * otherwise
	 * the book is added to database.
	 * @param book
	 * @throws BookException
	 */
	void addBook(Book book,int userId) throws BookException;
	/**
	 * showBookList() lists all the book from database.
	 * @return
	 */
	List<Book> showBookList(int userId);
	/**
	 * update() method updates the book if it exists in the database 
	 * otherwise exception is thrown.
	 * @param book
	 * @param isbn
	 * @throws BookException 
	 */
	void update(Book book,int userId) throws BookException;
	/**
	 * delete() method deletes the book if it exists in the database
	 * otherwise exception is thrown.
	 * @param isbn
	 */
	void delete(Long isbn,int userId) throws BookException;
	/**
	 * find() method returns a book having the provided isbn.
	 * @param isbn
	 * @return
	 * @throws BookException
	 */
	Book find(Long isbn,int userId) throws BookException;
	
}
