package com.ssafy.mvc.model.dao;

import java.sql.*;

// 커넥션 연결 및 리소스 close 관련 static 메소드 구현
public class DBUtil {
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/BOOK_DB?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "ssafy";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace(); // 엥간하면 이건 절대 지우지 말것.. 콘솔에 에러 문구가 안떠서 아아주 곤난함.
		}
	}

	public static Connection makeConnection() {
		try {
			return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
		return null;
	}

	public static void close(AutoCloseable... out) {
		for (AutoCloseable c : out) {
			if (c != null) {
				try {
					c.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
