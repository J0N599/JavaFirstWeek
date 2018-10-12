package com.qa.Person;

public class Person {

	String name;

	int age;

	String jobTitle;

	public Person(String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}

	public String toString() {
		String formattedString = name + " " + age + " " + jobTitle;
		return formattedString;

	}
}
