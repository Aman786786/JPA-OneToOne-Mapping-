package com.BooApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BooApp.entity.Auther;
import com.BooApp.repository.AutherRepository;

@Service 
public class AutherService {

	@Autowired 
	private AutherRepository autherRepository;
	
	public Auther saveAuther(Auther auther) {
		
		return autherRepository.save(auther);
	}
	
	
	

}
