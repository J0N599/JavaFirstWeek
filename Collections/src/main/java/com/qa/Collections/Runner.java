package com.qa.Collections;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		oneToOneHundred();
		System.out.println("");
		System.out.print(hundredList());
		System.out.println("");
		System.out.print(tenMultiply(hundredList()));

	}

	public static void oneToOneHundred() {
		int[] hundredArray = new int[100];
		for (int i = 0; i <= (hundredArray.length - 1); ++i) {
			hundredArray[i] = i + 1;
			System.out.print(hundredArray[i] + " ");
		}
	}

	public static List<Integer> hundredList() {
		List<Integer> hundredList = new ArrayList<Integer>();
		for (int i = 100; i <= 999; ++i) {
			hundredList.add(i);
		}
		return hundredList;
	}

	public static List<Integer> tenMultiply(List<Integer> list) {
		List<Integer> multiplyList = new ArrayList<Integer>();
		for (int number : list) {
			multiplyList.add(number * 10);
		}
		return multiplyList;
	}
}
