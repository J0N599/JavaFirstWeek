import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		int a;
		int b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		a = input.nextInt();
		System.out.print("Enter integer: ");
		b = input.nextInt();

		System.out.println(addition(a, b));
		System.out.println(subtraction(a, b));
		System.out.println(multiplication(a, b));
		System.out.println(division(a, b));
	}

	public static int addition(int a, int b) {
		return a + b;

	}

	public static int subtraction(int a, int b) {
		return a - b;

	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

}
