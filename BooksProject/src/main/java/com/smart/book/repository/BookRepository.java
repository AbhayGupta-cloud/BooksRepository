package com.smart.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.smart.book.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	public List<Book> findByAuthorName(String my_name);
	
	@Query(value = "select * from Book b where b.author_name = ?1 and b.name = ?2", nativeQuery = true)
    public List<Book> getBooksByAuthorAndBookName(String authorName, String bookName);

}
