package com.smart.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.book.model.Book;
import com.smart.book.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/createBook")
	public void createBook(@RequestBody Book book) {
		//todo save the book using repository object
		bookRepository.save(book);
	}
	@GetMapping("/getBookByAuthorName")
	public List<Book> getBooks(@RequestParam(value="name") String name){
		
		return bookRepository.findByAuthorName(name);
	}
}
