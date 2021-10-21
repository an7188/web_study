package com.ssafy.mvc.model.dao;

import java.util.List;

import com.ssafy.mvc.model.dto.BookDto;

// 데이터베이스 작업에 어떤 기능들이 필요한지 메뉴판
public interface IBookDao {
	int add(BookDto book);
	BookDto select(int bookId);
	List<BookDto> selectAll();
	int delete(int bookId);
}
