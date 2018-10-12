
public class Runner {

	static int[] results = { 100, 120, 130 }; // Physics, Chemistry, Biology

	public static void main(String[] args) {
		results();
		percentage();
		System.out.println(results.length);

	}

	public static void results() {
		System.out.print("Your Physics mark is: ");
		System.out.println(results[0]);
		System.out.print("Your Chemistry mark is: ");
		System.out.println(results[1]);
		System.out.print("Your Biology mark is: ");
		System.out.println(results[2]);
		System.out.print("Your Total mark is: ");
		// System.out.println(total);

	}

	public static void percentage() {
		for (int i = 0; i <= (results.length - 1); ++i) {
			System.out.println(results[i]);
		}
	}
}

/*
 * public static String failCheck() { if (calculatePercentage < 60 || physics <
 * 60 || chemistry < 60 || biology < 60) { return "You have failed your exams";
 * } else { return "Congratulations, you have passed your exams"; } } }
 */