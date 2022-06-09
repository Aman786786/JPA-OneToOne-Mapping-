package com.BooApp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Books")
public class Book {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int BookId;
	private String Book_Title;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Auther auther;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String book_Title, Auther auther) {
		super();
		BookId = bookId;
		Book_Title = book_Title;
		this.auther = auther;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBook_Title() {
		return Book_Title;
	}

	public void setBook_Title(String book_Title) {
		Book_Title = book_Title;
	}

	public Auther getAuther() {
		return auther;
	}

	public void setAuther(Auther auther) {
		this.auther = auther;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", Book_Title=" + Book_Title + ", auther=" + auther + "]";
	}

	

}
