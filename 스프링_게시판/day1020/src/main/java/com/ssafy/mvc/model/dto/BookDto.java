package com.ssafy.mvc.model.dto;


// BookVO(Variable Object) == Book == BookBean == 책정보뭉텅이
public class BookDto { // Data Transfer Object
	private int bookId;
	private String title;
	private String writer;
	private String publisher;
	private int price;
////////////////////////////////////////////////////////////////////////////////////
	public BookDto(int bookId, String title, String writer, String publisher, int price) {
		this.bookId = bookId;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
	}
	public BookDto(String title, String writer, String publisher, int price) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
	}
	public BookDto() {}
////////////////////////////////////////////////////////////////////////////////////	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookDto [bookId=" + bookId + ", title=" + title + ", writer=" + writer + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}
}
