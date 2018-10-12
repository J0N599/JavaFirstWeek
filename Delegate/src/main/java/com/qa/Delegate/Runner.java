package com.qa.Delegate;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Delegate d1 = new Delegate("Naveed", 12234, 5, 7);
		Delegate d2 = new Delegate("Jon", 23456, 6, 3);

		d1.remove();
		d1.changeStream();

		System.out.println(d1.name + " " + d2.name);
		System.out.println(d1.techSkills + " " + d2.techSkills);
		System.out.println(d1.softSkills + " " + d2.softSkills);

		for (; d1.techSkills < 10; d1.techSkills++) {
			System.out.println(d1.name);
		}

	}

}
