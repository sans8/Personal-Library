package com.yash.plm.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.plm.dao.BookDAO;
import com.yash.plm.db.JDBCUtil;
import com.yash.plm.model.Book;

public class BookDAOImpl extends JDBCUtil implements BookDAO {

	@Override
	public void save(Book book,int userId) {
		PreparedStatement pstmt = null;
		String sql = "insert into books(title,author,price,publisher,isbn,userId) values(?,?,?,?,?,?)";
		pstmt = prepareStatement(sql);
		try {
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2,book.getAuthor());
			pstmt.setFloat(3, book.getPrice());
			pstmt.setString(4, book.getPublisher());
			pstmt.setLong(5,book.getIsbn());
			pstmt.setInt(6, userId);
			pstmt.execute();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Book> findAll(int userId) {
		List<Book> list = new ArrayList<Book>();
		String sql = "select * from books where UserId='"+userId+"'";
		Book book = null;
		PreparedStatement pstmt = prepareStatement(sql);
		try	{
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				book = new Book();
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getFloat("price"));
				book.setPublisher(rs.getString("publisher"));
				book.setIsbn(rs.getLong("isbn"));
				list.add(book);
			}
		}
		catch(Exception e)	{
			System.out.println(e.getMessage());
		}		
		return list;
	}

	@Override
	public void delete(Long isbn,int userId) {
		String sql = "delete from books where isbn = '"+isbn+"' and UserId = '"+userId+"'";
		PreparedStatement pstmt = prepareStatement(sql);
		try	{
			pstmt.execute();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void update(Book book,int userId) {
		String sql = "update books set title=?, author=?, price=?, publisher=? where isbn=? and UserId=?";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setFloat(3, book.getPrice());
			pstmt.setString(4, book.getPublisher());
			pstmt.setLong(5,book.getIsbn());
			pstmt.setInt(6,userId);
			pstmt.execute();
			System.out.println("Updated Successfully");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Book find(Long isbn,int userId) {
		Book book = null;
		String sql = "select * from books where isbn='"+isbn+"' and UserId = '"+userId+"' ";
		PreparedStatement pstmt = prepareStatement(sql);
		try	{
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())	{
				book = new Book();
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getFloat("price"));
				book.setPublisher(rs.getString("publisher"));
				book.setIsbn(rs.getLong("isbn"));
			}
		}
		catch(Exception e)	{
			System.out.println(e.getMessage());
		}
		return book;
	}

}
