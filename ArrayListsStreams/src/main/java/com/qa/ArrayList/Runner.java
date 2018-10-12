package com.qa.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		System.out.print("Squared Number: ");
		printSquared();
		System.out.println("");
		System.out.print("Uniqued Squared Number: ");
		printUniqueSquared();
	}

	public static void printAll() {
		List<Integer> all = numbers.stream().collect(Collectors.toList());
		System.out.print(all);
	}

	public static void printEven() {
		List<Integer> even = numbers.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.print(even);
	}

	public static void printTimesByTen() {
		List<Integer> timesByTen = numbers.stream().map(i -> i * 10).collect(Collectors.toList());
		System.out.print(timesByTen);
	}

	public static void printHighest() {
		List<Integer> maxNum = numbers.stream().sorted().collect(Collectors.toList());
		System.out.print(maxNum.get(maxNum.size() - 1));
	}

	public static void printLowest() {
		List<Integer> minNum = numbers.stream().sorted().collect(Collectors.toList());
		System.out.print(minNum.get(0));
	}

	public static void printSquared() {
		List<Integer> squareNum = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.print(squareNum);
	}

	public static void printUniqueSquared() {
		List<Integer> uniqueNum = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.print(uniqueNum);
	}
}