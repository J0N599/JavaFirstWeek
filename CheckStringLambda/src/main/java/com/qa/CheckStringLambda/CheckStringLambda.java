package com.qa.CheckStringLambda;

public class CheckStringLambda {

	public static void main(String[] args) {
		CheckString wordCompare = (word1, word2) -> word1.equals(word2);

		System.out.println(wordCompare.check("Hello", "Hello"));
	}

}

interface CheckString {
	boolean check(String word1, String word2);
}
