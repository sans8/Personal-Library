package com.yash.plm.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.yash.plm.db.JDBCUtil;

public class DBUtilTest extends JDBCUtil {
	
	public static void main(String args[])	{
		Connection con = getConnection();
		System.out.println(con);
		String sql="insert into books(title) values('Let us C')";
		PreparedStatement pstmt = prepareStatement(sql);
		System.out.println(pstmt);
	}
}
