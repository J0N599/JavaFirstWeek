package com.qa.PairProgramming;

public class Factorial {

	public String checkFactorial(int number) {

		double j = 1;

		for (double i = 1; i < number; i++) {

			j = j * i;

			if (number / j == 1) {
				return Double.toString(i);
			}
		}
		return "NONE";
	}

}

// Most people are familiar with the factorial operator in math. 5! yields 120
// because factorial means "multiply successive terms where each are one less
// than the previous":
// 5! -> 5 * 4 * 3 * 2 * 1 -> 120
// Now let's reverse it. Could you write a function that tells us that "120" is
// "5!"?
// Hint: divide the term by successively larger terms until you get to "1" as
// the resultant:
// 120 -> 120/2 -> 60/3 -> 20/4 -> 5/5 -> 1 => 5!
