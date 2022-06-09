package com.BooApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BooApp.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>  {

}
