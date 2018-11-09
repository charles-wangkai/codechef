import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final String TARGET = "chef";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String s = sc.next();

			System.out.println(solve(s));
		}

		sc.close();
	}

	static String solve(String s) {
		int count = (int) IntStream.rangeClosed(0, s.length() - TARGET.length())
				.filter(i -> isValid(s.substring(i, i + TARGET.length()))).count();

		if (count == 0) {
			return "normal";
		} else {
			return "lovely " + count;
		}
	}

	static boolean isValid(String part) {
		return TARGET.chars().allMatch(ch -> part.indexOf(ch) >= 0);
	}
}
