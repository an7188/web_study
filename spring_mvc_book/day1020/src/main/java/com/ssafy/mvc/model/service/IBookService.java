package com.ssafy.mvc.model.service;

import java.util.List;

import com.ssafy.mvc.model.dto.BookDto;

public interface IBookService {
	List<BookDto> getList();

	boolean add(BookDto book);
	

}
