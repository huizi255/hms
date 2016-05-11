package com.rj1.TVManager.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 连接工厂
 * */
public class ConnectionFactory {
	private static String driver;
	private static String url ;
	private static String user;
	private static String password;
	
	static{
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://127.0.0.1:3306/cms?useUnicode=true&amp;characterEncoding=UTF-8";
		user = "root";
		password = "root";
	}
	public static Connection getConn () {
		Connection conn = null;
		try {
			//1.注册驱动
			Class.forName(driver);
			//2.获取连接
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException{
		if(rs!=null){
			rs.close();
		}
		if(pstmt!=null){
			pstmt.close();
		}
		if(conn!=null){
			conn.close();
		}
	}
}
