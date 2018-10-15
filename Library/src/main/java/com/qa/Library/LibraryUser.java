package com.qa.Library;

public class LibraryUser extends LibraryPeople {

	String phoneNumber;

	String address;

	int bookId;

	public LibraryUser(int idNumber, String name, String authority, String phoneNumber, String address,
			int bookId) {
		this.idNumber = idNumber;
		this.name = name;
		this.authority = authority;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.bookId = bookId;
	}

	public Book checkOut(LibraryUser testCard, Book testBook) {
		testBook.setNumberInStock(testBook.getNumberInStock() - 1);
		testCard.setBookId(testBook.getIdNumber());
		return testBook;
	}

	public Book checkIn(LibraryUser testCard, Book testBook) {
		testBook.setNumberInStock(testBook.getNumberInStock() + 1);
		testCard.setBookId(9999);
		return testBook;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

}
