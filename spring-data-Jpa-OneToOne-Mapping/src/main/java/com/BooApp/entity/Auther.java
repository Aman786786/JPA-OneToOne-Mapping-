package com.BooApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Auther {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int AutherId;
	private String firstName;
	private String lastName;
	private String language;
	public Auther() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auther(int autherId, String firstName, String lastName, String language) {
		super();
		AutherId = autherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
	}
	public int getAutherId() {
		return AutherId;
	}
	public void setAutherId(int autherId) {
		AutherId = autherId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Auther [AutherId=" + AutherId + ", firstName=" + firstName + ", lastName=" + lastName + ", language="
				+ language + "]";
	}

}
