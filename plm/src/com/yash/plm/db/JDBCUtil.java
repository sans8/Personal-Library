package com.yash.plm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * This class is used to perform database connectivity   
 * like
 * loading driver class
 * establishing connection
 * getting prepared statement
 */

public class JDBCUtil {

	private static Connection con = null;
	private static PreparedStatement pstmt = null;
	
	/**
	 * this block loads the driver class.
	 */
	static {
		try {
			Class c= Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * getConnection() method establishes connection with the database.
	 * @return
	 */
	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/plm", "root", "root");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}

	/**
	 * prepareStatement() method gives a SQL prepared statement for SQL query execution.
	 * @param sql
	 * @return
	 */
	public static PreparedStatement prepareStatement(String sql) {
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return pstmt;
	}
}
