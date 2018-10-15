package com.qa.Library;

public class Book extends LibraryItems {

	String author;

	int numberInStock;

	public Book(int idNumber, String name, int publishDate, String author, int numberInStock) {

		this.idNumber = idNumber;
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
		this.numberInStock = numberInStock;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberInStock() {
		return numberInStock;
	}

	public void setNumberInStock(int numberInStock) {
		this.numberInStock = numberInStock;
	}

}
