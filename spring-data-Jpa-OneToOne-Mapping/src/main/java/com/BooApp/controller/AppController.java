package com.BooApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BooApp.Dto.AppResponse;
import com.BooApp.Service.AutherService;
import com.BooApp.Service.BookService;
import com.BooApp.entity.Auther;
import com.BooApp.entity.Book;
import com.BooApp.repository.AutherRepository;


@RestController 
public class AppController {

	
	@Autowired 
	private AutherService autherService;
	@Autowired 
	private BookService bookService;
	@Autowired 
	private AutherRepository autherRepository;
	
	
	@PostMapping("/AddAuther")
	public Auther saveAuther(@RequestBody Auther auther) {
		return autherService.saveAuther(auther);
	}
	
	@PostMapping("/AddBook")
	public Book saveBook(@RequestBody Book book) {
		
		return bookService.saveBook(book);
	}
	
	 @GetMapping("/getInfo")
	    public List<AppResponse> getJoinInformation(){
	        return autherRepository.getJoinInformation();
	    }
}
