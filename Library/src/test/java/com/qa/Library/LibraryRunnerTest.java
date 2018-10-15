package com.qa.Library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibraryRunnerTest {

	@Test

	public void bookTest() {

		Book testBook = new Book(123, "test", 1998, "testauthor", 5);

		assertEquals(123, testBook.getIdNumber());
		assertEquals("test", testBook.getName());
		assertEquals("testauthor", testBook.getAuthor());
		assertEquals(1998, testBook.getPublishDate());
		assertEquals(5, testBook.getNumberInStock());

	}

	@Test

	public void bookCheckOutTest() {

		Book testBook = new Book(123, "test", 1998, "testauthor", 5);
		LibraryUser testCard = new LibraryUser(987, "testname", "Cardholder", "123456789", "testaddress", 9999);

		testCard.checkOut(testCard, testBook);

		assertEquals(4, testBook.getNumberInStock());
		assertEquals(123, testCard.getBookId());

	}

	@Test

	public void bookCheckInTest() {

		Book testBook = new Book(123, "test", 1998, "testauthor", 5);
		LibraryUser testCard = new LibraryUser(987, "testname", "Cardholder", "123456789", "testaddress", 123);

		testCard.checkIn(testCard, testBook);

		assertEquals(6, testBook.getNumberInStock());
		assertEquals(9999, testCard.getBookId());

	}

	@Test

	public void addBookTest() {

		Book testBook = new Book(123, "test", 1998, "testauthor", 5);

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(testBook, James.addItem(testBook));

	}

	@Test
	public void addNewspaperTest() {

		Newspaper testNewspaper = new Newspaper(123, "test", 1998, "testpublication");

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(testNewspaper, James.addItem(testNewspaper));

	}

	@Test
	public void addMapTest() {

		Map testMap = new Map(123, "test", 1998, "testlocation");

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(testMap, James.addItem(testMap));

	}

	@Test

	public void removeBookTest() {

		Book testBook = new Book(123, "test", 1998, "testauthor", 5);

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(0, James.removeItem(testBook).getIdNumber());

	}

	@Test

	public void removeNewspaperTest() {

		Newspaper testNewspaper = new Newspaper(123, "test", 1998, "testpublication");

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(0, James.removeItem(testNewspaper).getIdNumber());

	}

	@Test

	public void removeMapTest() {

		Map testMap = new Map(123, "test", 1998, "testlocation");

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(0, James.removeItem(testMap).getIdNumber());

	}

	@Test

	public void updateBookTest() {

		Book testBook = new Book(123, "test", 1998, "testauthor", 5);
		Book updateBook = new Book(321, "testupdate", 2000, "testauthorupdate", 50);

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(321, James.updateBook(testBook, updateBook).getIdNumber());

	}

	@Test

	public void updateNewspaperTest() {

		Newspaper testNewspaper = new Newspaper(123, "test", 1998, "testpublication");
		Newspaper updateNewspaper = new Newspaper(321, "testupdate", 2000, "testpublicationupdate");

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(321, James.updateNewspaper(testNewspaper, updateNewspaper).getIdNumber());

	}

	@Test

	public void updateMapTest() {

		Map testMap = new Map(123, "test", 1998, "testpublication");
		Map updateMap = new Map(321, "testupdate", 2000, "testpublicationupdate");

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		assertEquals(321, James.updateMap(testMap, updateMap).getIdNumber());

	}

	public void registerPerson() {

		LibraryAdmin James = new LibraryAdmin(1, "James", "Admin");

		LibraryUser testCard = new LibraryUser(987, "testname", "Cardholder", "123456789", "testaddress", 9999);

		userList.add(James.registerPerson(testCard));

		assertEquals(testCard, userList.get(testCard));

	}

}
