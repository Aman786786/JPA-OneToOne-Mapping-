package com.BooApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BooApp.entity.Book;
import com.BooApp.repository.BookRepository;


@Service 
public class BookService {

	@Autowired 
	private BookRepository bookRepository ;
	
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

}
