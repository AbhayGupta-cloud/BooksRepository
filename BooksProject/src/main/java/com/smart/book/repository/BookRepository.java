package com.smart.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.book.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	public List<Book> findByAuthorName(String my_name);
}
