public class Runner {
	static String compareToString = "Hello";
	static String inputString = "Hello";

	public static void main(String[] args) {
		System.out.println(checkString(inputString));

	}

	public static boolean checkString(String inputString) {
		int comparison = inputString.compareToIgnoreCase(compareToString);

		if (comparison == 0) {
			return true;
		} else {
			return false;
		}

	}
}
