package com.ikubinfo.hashcode.classes;

import java.util.List;

public class Library {
	
	private int id;
	private int signupDays;
	private List<Books> bookList;
	private int scanningNumber;
	public int nrOfBooks;
	
	public Library() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getNrOfBooks() {
		return nrOfBooks;
	}
	public void setNrOfBooks(int nrOfBooks) {
		this.nrOfBooks = nrOfBooks;
	}

	public int getSignupDays() {
		return signupDays;
	}

	public void setSignupDays(int signupDays) {
		this.signupDays = signupDays;
	}

	public List<Books> getBookList() {
		return bookList;
	}

	public void setBookList(List<Books> bookList) {
		this.bookList = bookList;
	}

	public int getScanningNumber() {
		return scanningNumber;
	}

	public void setScanningNumber(int scanningNumber) {
		this.scanningNumber = scanningNumber;
	}
	
	
}
