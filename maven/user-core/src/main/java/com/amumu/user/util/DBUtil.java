package com.amumu.user.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
	private static String driverClass = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String user = "scott";
	private static String pwd = "scottpwd";

	/**
	 * 获取与数据库的连接
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Connection getConnection() throws Exception {
		Class.forName(driverClass);
		return DriverManager.getConnection(url, user, pwd);
	}

	/**
	 * 关闭连接
	 * 
	 * @param conn
	 * @param stm
	 * @param rs
	 */
	public static void closeConnection(Connection conn, Statement stm, ResultSet rs) {
		try {
			if (conn != null)
				conn.close();
			if (stm != null)
				stm.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		try {
			System.out.println(new DBUtil().getConnection().getClass().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
