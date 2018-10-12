
public class Runner {
	public static void main(String[] args) {
		String input = "Hello";
		char[] reverse = input.toCharArray();

		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(reverse[i]);
		}

	}
}
