package com.yash.plm.serviceimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.plm.dao.BookDAO;
import com.yash.plm.dao.UserDAO;
import com.yash.plm.daoimpl.BookDAOImpl;
import com.yash.plm.daoimpl.UserDAOImpl;
import com.yash.plm.db.JDBCUtil;
import com.yash.plm.exception.BookException;
import com.yash.plm.exception.UserException;
import com.yash.plm.model.Book;
import com.yash.plm.model.User;
import com.yash.plm.service.UserService;

public class UserServiceImpl extends JDBCUtil implements UserService  {

	@Override
	public User getUser(String loginName, String password) {
		User user = null;
		String sql = "select * from users where loginName='"+loginName+"' and password='"+password+"'";
		PreparedStatement pstmt = prepareStatement(sql);
		ResultSet rs;
		try {
			rs = pstmt.executeQuery();
			if(rs.next())	{
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setLoginName(rs.getString("loginName"));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override
	public void add(User user) throws UserException {
		UserDAO userDAO =new UserDAOImpl();
		User tempUser =null;
		tempUser= userDAO.find(user.getLoginName());
		if(tempUser==null)	{
			userDAO.save(user);
		}
		else	{
			throw new UserException("User already exists");
		}
		
	}
}
