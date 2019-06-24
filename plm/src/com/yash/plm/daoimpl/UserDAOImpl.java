package com.yash.plm.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.yash.plm.dao.UserDAO;
import com.yash.plm.db.JDBCUtil;
import com.yash.plm.model.User;

public class UserDAOImpl extends JDBCUtil implements UserDAO{

	@Override
	public void save(User user) {
		String sql = "insert into users (name,loginname,password) values (?,?,?)";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
				pstmt.setString(1,user.getName());
				pstmt.setString(2, user.getLoginName());
				pstmt.setString(3, user.getPassword());
				pstmt.execute();
		}
		catch(Exception e)	{
			System.out.println(e.getMessage());
		}
	}

	@Override
	public User find(String username) {
		User user = null;
		String sql= "select * from users where loginname= '"+username+"'";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
				ResultSet rs = pstmt.executeQuery();
				if(rs.next())	{
					user= new User();
					user.setName(rs.getString("name"));
					user.setLoginName(rs.getString("loginName"));
					user.setPassword(rs.getString("password"));
				}
		}
		catch(Exception e)	{
			System.out.println(e.getMessage());
		}
		return user;
	}

}
