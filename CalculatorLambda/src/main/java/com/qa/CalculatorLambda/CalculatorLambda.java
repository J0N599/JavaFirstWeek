package com.qa.CalculatorLambda;

public class CalculatorLambda {

	public static void main(String[] args) {

		MathOperation add = (a, b) -> a + b;
		MathOperation subtract = (a, b) -> a - b;
		MathOperation multiply = (a, b) -> a * b;
		MathOperation divide = (a, b) -> a / b;

		System.out.println(operation(5, 7, add));
		System.out.println(operation(10, 7, subtract));
		System.out.println(operation(5, 72, multiply));
		System.out.println(operation(5, 17, divide));
	}

	interface MathOperation {
		double operate(double a, double b);
	}

	public static double operation(double a, double b, MathOperation mathOperation) {
		return mathOperation.operate(a, b);
	}
}