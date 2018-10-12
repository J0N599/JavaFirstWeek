import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	static List<Double> resultsList = Arrays.asList(110.0, 114.0, 120.0); // physics , chemistry , biology
	static List<Double> resultsPercentage = resultsList.stream().map(i -> i / 150 * 100).collect(Collectors.toList());
	static double overallPercentage = (resultsPercentage.stream().mapToDouble(Double::doubleValue).sum() / 3);

	public static void main(String[] args) {

		results();
		percentage();
		failCheck();

	}

	public static void results() {
		System.out.print("Your Physics mark is: ");
		System.out.println(resultsList.get(0));
		System.out.print("Your Chemistry mark is: ");
		System.out.println(resultsList.get(1));
		System.out.print("Your Biology mark is: ");
		System.out.println(resultsList.get(2));
		System.out.print("Your Total mark is: ");
		double total = resultsList.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println(total);

	}

	public static void percentage() {
		System.out.print("Your Physics percentage is: ");
		System.out.println(String.format("%.2f", resultsPercentage.get(0)) + "%");
		System.out.print("Your Chemistry percentage is: ");
		System.out.println(String.format("%.2f", resultsPercentage.get(1)) + "%");
		System.out.print("Your Biology percentage is: ");
		System.out.println(String.format("%.2f", resultsPercentage.get(2)) + "%");
		System.out.print("Your overall percentage is: ");
		System.out.println(String.format("%.2f", overallPercentage) + "%");
	}

	public static void failCheck() {
		if (overallPercentage >= 60 && resultsList.get(0) >= 60 && resultsList.get(1) >= 60
				&& resultsList.get(2) >= 60) {
			System.out.println("Congratulations, you have passed your exams");
		}
		if (resultsList.get(0) <= 60) {
			System.out.println("You have failed your physics exam");
		}
		if (resultsList.get(1) <= 60) {
			System.out.println("You have failed your chemistry exam");
		}
		if (resultsList.get(2) <= 60) {
			System.out.println("You have failed your biology exam");
		}
	}
}
