package com.qa.Library;

public class Newspaper extends LibraryItems {

	String publicationName;

	public Newspaper(int idNumber, String name, int publishDate, String publicationName) {

		this.idNumber = idNumber;
		this.name = name;
		this.publishDate = publishDate;
		this.publicationName = publicationName;

	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

}
