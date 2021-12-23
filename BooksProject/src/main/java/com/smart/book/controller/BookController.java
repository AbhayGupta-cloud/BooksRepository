package com.smart.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.book.model.Book;
import com.smart.book.model.BookCategory;
import com.smart.book.repository.BookCategoryRepository;
import com.smart.book.repository.BookRepository;
import com.smart.book.request.CreateCategoryRequest;

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;
	@Autowired
	BookCategoryRepository bookCategoryRepository;
//	@PostMapping("/createBook")
//	public void createBook(@RequestBody Book book) {
//		//todo save the book using repository object
//		bookRepository.save(book);
//	}
//	@GetMapping("/getBookByAuthorName")
//	public List<Book> getBooks(@RequestParam(value="name") String name){
//		
//		return bookRepository.findByAuthorName(name);
//	}
	@PostMapping("/createCategorywithBooks")
	public void createCategoryWithBooks(@RequestBody CreateCategoryRequest request) {
		bookCategoryRepository.save(new BookCategory(request.getBookCategoryName(),request.getBooks()));
	}
	@PostMapping("/createCategory")
	public void createCategory(@RequestBody CreateCategoryRequest request) {
		bookCategoryRepository.save(new BookCategory(request.getBookCategoryName()));
	}
	@PostMapping("/createBooks")
	public void createBooks(@RequestBody CreateCategoryRequest request) {
		bookRepository.saveAll(request.getBooks());
	}
	@GetMapping("/getBooks")
	public List<Book> getBooks(@RequestParam(value="name") String name,@RequestParam(value="authorName") String authorName){
		//TODO create getbooks by author and bookname repository functions
		return bookRepository.getBooksByAuthorAndBookName(authorName, name);
	}
}
