package com.ssafy.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.mvc.model.dao.IBookDao;
import com.ssafy.mvc.model.dto.BookDto;

@Service
public class BookServiceImp implements IBookService {

	@Autowired
	private IBookDao dao;

	@Override
	public List<BookDto> getList() {

		return dao.selectAll();
	}

	@Override
	public boolean add(BookDto book) {
		if(dao.add(book)>0) {
		return true;
		}
		return false;
	}

}
