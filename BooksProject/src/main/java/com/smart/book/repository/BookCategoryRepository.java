package com.smart.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.book.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Integer>{
	
}
