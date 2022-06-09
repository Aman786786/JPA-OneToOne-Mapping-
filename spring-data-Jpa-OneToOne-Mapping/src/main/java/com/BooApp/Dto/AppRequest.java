package com.BooApp.Dto;

import com.BooApp.entity.Auther;

public class AppRequest {

	
	private Auther auther ;

	public AppRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppRequest(Auther auther) {
		super();
		this.auther = auther;
	}

	public Auther getAuther() {
		return auther;
	}

	public void setAuther(Auther auther) {
		this.auther = auther;
	}

	@Override
	public String toString() {
		return "AppRequest [auther=" + auther + "]";
	}
	
	
}
