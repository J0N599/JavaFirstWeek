public class Runner {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		String operator = "add";
		System.out.println(calculator(a, b, operator));
	}

	public static double calculator(double a, double b, String operator) {

		switch (operator) {
		case "add":
			return a + b;
		case "subtract":
			return a - b;
		case "multiply":
			return a * b;
		case "divide":
			return a / b;
		default:
			System.out.println("Please enter a vaid operation");
			return 0;

		}
	}
}