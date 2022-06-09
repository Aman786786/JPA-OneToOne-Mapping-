package com.BooApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BooApp.entity.Auther;

public interface AutherRepository extends JpaRepository<Auther, Integer> {

	Auther save(Auther auther);

}
