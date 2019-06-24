package com.yash.plm.dao;

import java.util.List;

import com.yash.plm.model.Book;
/**
 * This interface declares methods that performs CRUD operations
 */
public interface BookDAO {
	/**
	 * save() method saves the provided book into the database.
	 * @param book
	 */
	void save(Book book,int userId);
	/**
	 * findAll() method retrieve all the books from the database.
	 * @return
	 */
	List<Book> findAll(int userId);
	/**
	 * delete() method deletes the book having the same isbn number as provided from the database.
	 * @param isbn
	 */
	void delete(Long isbn,int userId);
	/**
	 * update() method updates the details of the book whose isbn number is provided.
	 * @param book
	 * @param isbn
	 */
	void update(Book book,int userId);
	/**
	 * find() method retrieves a book with the matching isbn number.
	 * @param isbn
	 * @return
	 */
	Book find(Long isbn,int userId);
	
}
