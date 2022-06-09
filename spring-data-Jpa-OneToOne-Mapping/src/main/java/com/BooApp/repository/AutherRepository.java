package com.BooApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BooApp.Dto.AppResponse;
import com.BooApp.entity.Auther;


public interface AutherRepository extends JpaRepository<Auther, Integer> {

	Auther save(Auther auther);

	@Query("SELECT new com.BooApp.Dto.AppResponse(c.Book_Title , p.AutherId) From Auther c JOIN c.auther p")
    public List<AppResponse> getJoinInformation();

	
}


/*
 * @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p"
 * )
 */