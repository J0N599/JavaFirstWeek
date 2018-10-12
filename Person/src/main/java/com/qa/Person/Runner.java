package com.qa.Person;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	static Person p1 = new Person("Jon", 23, "Trainee");
	static Person p2 = new Person("Bill", 21, "Electrician");
	static Person p3 = new Person("Tom", 25, "Engineer");
	static Person p4 = new Person("James", 30, "Artist");
	static Person p5 = new Person("Fred", 34, "Musician");
	static Person p6 = new Person("Sam", 28, "Stock Broker");
	static Person p7 = new Person("Tim", 24, "Teacher");
	static Person p8 = new Person("Connor", 26, "Firefighter");
	static Person p9 = new Person("Liam", 32, "Policeman");
	static Person p10 = new Person("Pete", 40, "Farmer");

	public static List<Person> personList = new ArrayList<Person>();

	public static void main(String[] args) {
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		personList.add(p7);
		personList.add(p8);
		personList.add(p9);
		personList.add(p10);
		listPrint();
		System.out.println("");
		personSearch("Tim");

	}

	public static void listPrint() {
		for (Person person : personList) {
			System.out.println(person);
		}

	}

	public static void personSearch(String searchName) {
		for (Person person : personList) {
			if (person.name.equals(searchName)) {
				System.out.println(person);
			}
		}
	}
}
