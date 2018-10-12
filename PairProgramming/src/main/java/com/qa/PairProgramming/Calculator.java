package com.qa.PairProgramming;

public class Calculator {

	public String calculation(int num1, int num2, int num3) {
		if (num1 * num2 == num3) {
			return Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + Integer.toString(num3);
		}
		if (num1 * num3 == num2) {
			return Integer.toString(num1) + " * " + Integer.toString(num3) + " = " + Integer.toString(num2);
		}
		if (num3 * num2 == num1) {
			return Integer.toString(num3) + " * " + Integer.toString(num2) + " = " + Integer.toString(num1);
		}
		return null;
	}

}
