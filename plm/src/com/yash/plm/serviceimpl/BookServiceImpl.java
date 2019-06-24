package com.yash.plm.serviceimpl;

import java.util.List;

import com.yash.plm.dao.BookDAO;
import com.yash.plm.daoimpl.BookDAOImpl;
import com.yash.plm.exception.BookException;
import com.yash.plm.model.Book;
import com.yash.plm.service.BookService;

public class BookServiceImpl implements BookService  {

	@Override
	public void addBook(Book book,int userId) throws BookException{
		BookDAO bookDAO =new BookDAOImpl();
		Book tempBook =null;
		tempBook= bookDAO.find(book.getIsbn(),userId);
		if(tempBook==null)	{
			bookDAO.save(book,userId);
		}
		else	{
			throw new BookException("Book with this isbn already exists");
		}
	}

	@Override
	public List<Book> showBookList(int userId) {
		BookDAO bookDAO =new BookDAOImpl();
		List<Book> books=null;
		books = bookDAO.findAll(userId);
		return books;
	}

	@Override
	public void update(Book book,int userId) throws BookException{
		BookDAO bookDAO = new BookDAOImpl();
		Book tempBook =null;
		tempBook= bookDAO.find(book.getIsbn(),userId);
		if(tempBook!=null)	{
			bookDAO.update(book,userId);
		}
		else	{
			throw new BookException("Book with this isbn does not exists");
		}
	}

	@Override
	public void delete(Long isbn,int userId) throws BookException {
		BookDAO bookDAO = new BookDAOImpl();
		Book tempBook =null;
		tempBook= bookDAO.find(isbn,userId);
		if(tempBook!=null)	{
			bookDAO.delete(isbn,userId);
		}
		else	{
			throw new BookException("Book with this isbn does not exists");
		}
		
	}

	@Override
	public Book find(Long isbn,int userId) throws BookException {
		Book book = null;
		BookDAO bookDAO = new BookDAOImpl();
		book = bookDAO.find(isbn,userId);
		if(book==null)
			throw new BookException("Book not found!");
		return book;
	}

}
