package com.qa.HelloWorldTwo;

public class Runner {

	public static void main(String[] args) {

		Greeting helloWorld = (message) -> "Hello " + message;

		System.out.print(helloWorld.sayMessage("World"));
	}

	interface Greeting {

		String sayMessage(String message);

	}

}
