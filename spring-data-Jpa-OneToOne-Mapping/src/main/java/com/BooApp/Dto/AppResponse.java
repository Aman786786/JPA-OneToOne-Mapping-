package com.BooApp.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)


public class AppResponse {
	private String Book_Title;
	private int AutherId;
	public AppResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppResponse(String book_Title, int autherId) {
		super();
		Book_Title = book_Title;
		AutherId = autherId;
	}
	public String getBook_Title() {
		return Book_Title;
	}
	public void setBook_Title(String book_Title) {
		Book_Title = book_Title;
	}
	public int getAutherId() {
		return AutherId;
	}
	public void setAutherId(int autherId) {
		AutherId = autherId;
	}
	@Override
	public String toString() {
		return "AppResponse [Book_Title=" + Book_Title + ", AutherId=" + AutherId + "]";
	}
	
}
