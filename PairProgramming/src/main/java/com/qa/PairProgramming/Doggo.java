package com.qa.PairProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doggo {

	public List<Integer> emptyList = new ArrayList<Integer>();

	public List<Integer> hundredList() {
		for (int i = 1; i <= 100; ++i) {
			emptyList.add(i);
		}
		return emptyList;
	}

	public List<String> hundredString() {
		List<String> stringList = emptyList.stream().map(num -> Integer.toString(num)).collect(Collectors.toList());

		for (int i = 0; i <= stringList.size() - 1; i++) {
			if (stringList.get(i).charAt(stringList.get(i).length() - 1).equals("1"))
				;

		}
	}
}
