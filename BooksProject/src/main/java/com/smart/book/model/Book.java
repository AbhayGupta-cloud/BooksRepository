package com.smart.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Happy")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Happy_id")
	private int id;
	@Column(name="Happy_name")
	private String name;
	@Column(name="Happy_authorName")
	private String authorName;
	@Column(name="Happy_cost")
	private int cost;
	@ManyToOne
	@JoinColumn
	private BookCategory bookCategory;
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
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
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Book(String name, String authorName, int cost) {
		this.name = name;
		this.authorName = authorName;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorName=" + authorName + ", cost=" + cost + "]";
	}
	public Book() {
	}
	public Book(String name, String authorName, int cost,int bookCategory) {
		this.name = name;
		this.authorName = authorName;
		this.cost = cost;
		this.bookCategory=new BookCategory();
		this.bookCategory.setId(bookCategory);
		
	}
}
