package com.qa.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	static List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

	public static void main(String[] args) {

		System.out.print("All Numbers: ");
		printAll();
		System.out.println("");
		System.out.print("Even Numbers: ");
		printEven();
		System.out.println("");
		System.out.print("Multiplied by 10: ");
		printTimesByTen();
		System.out.println("");
		System.out.print("Highest Number: ");
		printHighest();
		System.out.println("");
		System.out.print("Lowest Number: ");
		printLowest();
		System.out.println("");
		System.out.print("Squared Values: ");
		printSquared();
	}

	public static void printAll() {
		for (int i = 0; i <= (numbers.size() - 1); i++) {
			System.out.print(numbers.get(i) + " ");
		}
	}

	public static void printEven() {
		for (int i = 0; i <= (numbers.size() - 1); i++) {
			if (numbers.get(i) % 2 == 0) {
				System.out.print(numbers.get(i) + " ");
			}
		}
	}

	public static void printTimesByTen() {
		for (int i = 0; i <= (numbers.size() - 1); i++) {
			int tenMultiple = numbers.get(i) * 10;
			System.out.print(tenMultiple + " ");
		}
	}

	public static void printHighest() {
		int highest = 0;
		for (int i = 0; i <= (numbers.size() - 1); i++) {
			if ((i + 1 <= numbers.size() - 1) && numbers.get(i + 1) > numbers.get(i)) {
				highest = numbers.get(i + 1);
			}
		}
		System.out.print(highest + " ");
	}

	public static void printLowest() {
		int Lowest = 100;
		for (int i = 0; i <= (numbers.size() - 1); i++) {
			if ((i + 1 <= numbers.size() - 1) && numbers.get(i + 1) < Lowest) {
				Lowest = numbers.get(i + 1);
			}
		}
		if (numbers.get(0) < Lowest) {
			Lowest = numbers.get(0);
		}
		System.out.print(Lowest + " ");
	}

	public static void printSquared() {
		List<Integer> squareNumbers = new ArrayList<>();
		for (int i = 0; i <= (numbers.size() - 1); i++) {
			int squared = (numbers.get(i) * numbers.get(i));
			squareNumbers.add(squared);
			System.out.print(squared + " ");
		}
		System.out.println();
		System.out.print("Squared Number Array: ");
		System.out.print(squareNumbers);
	}
}
