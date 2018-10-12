package com.qa.Delegate;

public class Delegate {

	public int techSkills;

	public int softSkills;

	public int uid;

	public String name;

	public String contact;

	public Delegate(String name, int uid, int techSkills, int softSkills) {

		this.name = name;
		this.uid = uid;
		this.techSkills = techSkills;
		this.softSkills = softSkills;
	}

	public void remove() {
		System.out.println("Delegate was removed");
	}

	public void changeStream() {
		System.out.println("Delegate has changed streams");
	}

}
