package com.smart.book.request;

import java.util.List;

import com.smart.book.model.Book;

public class CreateCategoryRequest {
	private String bookCategoryName;
	private List<Book> books;
	public String getBookCategoryName() {
		return bookCategoryName;
	}
	public void setBookCategoryName(String bookCategoryName) {
		this.bookCategoryName = bookCategoryName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
