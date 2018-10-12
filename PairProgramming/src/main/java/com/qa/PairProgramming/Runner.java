package com.qa.PairProgramming;

public class Runner {

	// public static List<Seat> seatList = new ArrayList<Seat>();
	//
	// static Seat seat1 = new Seat(30, 50);
	// static Seat seat2 = new Seat(130, 60);
	// static Seat seat3 = new Seat(90, 60);
	// static Seat seat4 = new Seat(150, 85);
	// static Seat seat5 = new Seat(120, 70);

	public static void main(String[] args) {
		// seatList.add(seat1);
		// seatList.add(seat2);
		// seatList.add(seat3);
		// seatList.add(seat4);
		// seatList.add(seat5);

		// Factorial newFactorial = new Factorial();

		// Calculator operation = new Calculator();

		Doggo dog = new Doggo();

		// System.out.println(newFactorial.checkFactorial(479001600));

		// System.out.println(operation.calculation(4, 2, 8));
		// System.out.println(operation.calculation(6, 2, 12));
		// System.out.println(operation.calculation(6, 2, 3));
		// System.out.println(operation.calculation(9, 12, 108));
		// System.out.println(operation.calculation(4, 16, 64));

		dog.hundredList().forEach(System.out::println);
		// dog.hundredList();
	}

}
