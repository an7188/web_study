package com.ssafy.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.mvc.model.dto.BookDto;
import com.ssafy.mvc.model.service.IBookService;

@Controller
public class BookController {
	
	@Autowired
	private IBookService service;

	@RequestMapping(value = "/")
	public String iiii() {
		return "index"; // /WEB-INF/vies/index.jsp
	}
	
	
	@RequestMapping(value  = "/bookList",method = RequestMethod.GET)
	public ModelAndView iiiiii() {
		ModelAndView mv = new ModelAndView("book_list");
		List<BookDto> bookList = new ArrayList<>();	
 
        mv.addObject("bList",service.getList());
        return mv;
	}
	
	@RequestMapping(value = "/bookAdd", method = RequestMethod.GET)
		public String aaaaa() {
			
		return "add_book_form";
		
	
	}
	
	@RequestMapping(value = "/bookAdd",method = RequestMethod.POST)
	public String aaa(BookDto book) {
		if(service.add(book)) {
			return "book_add_success";
		}else {
			return "book_add_fail";
		}
		
	}


}
