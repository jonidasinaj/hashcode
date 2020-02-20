package com.ikubinfo.hashcode.classes;

import java.util.List;

public class SetStatistics {
	
	private int nrOfBooks;
	private int nrOfLibraries;
	private int nrOfDays;
	private List<Integer> scoreList;
	private List<Library> libraryList;
	
	public SetStatistics() {
		
	}
	
	public int getNrOfBooks() {
		return nrOfBooks;
	}
	public void setNrOfBooks(int nrOfBooks) {
		this.nrOfBooks = nrOfBooks;
	}
	public int getNrOfLibraries() {
		return nrOfLibraries;
	}
	public void setNrOfLibraries(int nrOfLibraries) {
		this.nrOfLibraries = nrOfLibraries;
	}
	public int getNrOfDays() {
		return nrOfDays;
	}
	public void setNrOfDays(int nrOfDays) {
		this.nrOfDays = nrOfDays;
	}

	public List<Integer> getScoreList() {
		return scoreList;
	}

	public void setScoreList(List<Integer> scoreList) {
		this.scoreList = scoreList;
	}

	public List<Library> getLibraryList() {
		return libraryList;
	}

	public void setLibraryList(List<Library> libraryList) {
		this.libraryList = libraryList;
	}
	
	
	
}
