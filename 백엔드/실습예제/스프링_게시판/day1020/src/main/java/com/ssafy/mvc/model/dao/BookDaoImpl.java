package com.ssafy.mvc.model.dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssafy.mvc.model.dto.BookDto;



@Repository
public class BookDaoImpl implements IBookDao { // ver. mysql : 나중에 ver. oracle 인 클래스도 작성될 수 있음.
	
	@Override
	public int add(BookDto book) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = " INSERT INTO BOOK_TB(TITLE,WRITER,PUBLISHER,PRICE) " 
		+ " VALUES(?,?,?,?) ";

		try {
			conn = DBUtil.makeConnection();
			pstmt = conn.prepareStatement(sql);// Statement는 여기서 sql 넣지 않음.

			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getWriter());
			pstmt.setString(3, book.getPublisher());
			pstmt.setInt(4, book.getPrice());

			result = pstmt.executeUpdate(); // Statement 여기서 sql을 넣음.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt, conn);
		}

		return result;
	}

	@Override
	public BookDto select(int bookId) {
		BookDto result = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT BOOK_ID,TITLE,PRICE,WRITER,PUBLISHER FROM BOOK_TB WHERE BOOK_ID=?";

		try {
			conn = DBUtil.makeConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, bookId);

			rs = pstmt.executeQuery(); //rs 는 select 한 결과 테이블 형태로 결과를 가져온거임.ㅇㅇ
			if(rs.next()) {
				result = new BookDto();
				result.setBookId(rs.getInt(1));
				result.setTitle(rs.getString(2));
				result.setPrice(rs.getInt(3));
				result.setWriter(rs.getString(4));
				result.setPublisher(rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, pstmt, conn);
		}

		return result;
	}

	@Override
	public List<BookDto> selectAll() {
		ArrayList<BookDto> result = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT BOOK_ID,TITLE,PRICE,WRITER,PUBLISHER FROM BOOK_TB";

		try {
			conn = DBUtil.makeConnection();
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery(); //rs 는 select 한 결과 테이블 형태로 결과를 가져온거임.ㅇㅇ
			result = new ArrayList<>();
			
			while(rs.next()) {
				BookDto tmp = new BookDto();
				tmp.setBookId(rs.getInt(1));
				tmp.setTitle(rs.getString(2));
				tmp.setPrice(rs.getInt(3));
				tmp.setWriter(rs.getString(4));
				tmp.setPublisher(rs.getString(5));
				
				result.add(tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, pstmt, conn);
		}
		
		return result;
	}

	@Override
	public int delete(int bookId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			String sql = "DELETE FROM BOOK_TB WHERE BOOK_ID=?";
			conn = DBUtil.makeConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookId);
			
			result = pstmt.executeUpdate(); // SQL 실행!
		} catch (SQLException e) {
			System.out.println("delete sql 에러");
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt, conn);
		}
		
		return result;
	}
}
