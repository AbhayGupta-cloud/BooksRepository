package com.smart.book.model;

import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BookCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	//https://stackoverflow.com/questions/13027214/what-is-the-meaning-of-the-cascadetype-all-for-a-manytoone-jpa-association

	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	private List<Book> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public BookCategory() {
	}

	public BookCategory(String name) {
		this.name = name;
	}

	public BookCategory(String name, List<Book> books) {
		this.name = name;
		this.books = books;
		Iterator it = books.iterator();
	    while(it.hasNext()){
	       Book book =  (Book)it.next();
	       book.setBookCategory(this);
	    }
	}

}
