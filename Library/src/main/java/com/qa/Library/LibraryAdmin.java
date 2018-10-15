package com.qa.Library;

public class LibraryAdmin extends LibraryPeople {

	public LibraryAdmin(int idNumber, String name, String authority) {
		this.idNumber = idNumber;
		this.name = name;
		this.authority = authority;
	}

	public LibraryUser registerPerson(LibraryUser testCard) {
		return null;

	}

	public LibraryUser deletePerson() {
		return null;

	}

	public LibraryUser updatePerson() {
		return null;

	}

	public LibraryItems addItem(LibraryItems item) {
		return item;
	}

	public LibraryItems removeItem(LibraryItems item) {
		item.setIdNumber(0);
		return item;
	}

	public Book updateBook(Book oldBook, Book updateBook) {
		oldBook.setIdNumber(updateBook.getIdNumber());
		oldBook.setName((updateBook.getName()));
		oldBook.setPublishDate((updateBook.getPublishDate()));
		oldBook.setAuthor(updateBook.getAuthor());
		oldBook.setNumberInStock(oldBook.getNumberInStock());
		return oldBook;
	}

	public Newspaper updateNewspaper(Newspaper oldNewspaper, Newspaper updateNewspaper) {
		oldNewspaper.setIdNumber(updateNewspaper.getIdNumber());
		oldNewspaper.setName((updateNewspaper.getName()));
		oldNewspaper.setPublishDate((updateNewspaper.getPublishDate()));
		oldNewspaper.setPublicationName(updateNewspaper.getPublicationName());
		return oldNewspaper;
	}

	public Map updateMap(Map oldMap, Map updateMap) {
		oldMap.setIdNumber(updateMap.getIdNumber());
		oldMap.setName((updateMap.getName()));
		oldMap.setPublishDate((updateMap.getPublishDate()));
		oldMap.setLocation(updateMap.getLocation());
		return oldMap;
	}

}
