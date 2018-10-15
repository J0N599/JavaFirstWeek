package com.qa.Library;

public class Map extends LibraryItems {

	String location;

	public Map(int idNumber, String name, int publishDate, String location) {

		this.idNumber = idNumber;
		this.name = name;
		this.publishDate = publishDate;
		this.location = location;

	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
