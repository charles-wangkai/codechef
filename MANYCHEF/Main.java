import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final String TARGET = "CHEF";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S));
		}

		sc.close();
	}

	static String solve(String S) {
		StringBuilder result = new StringBuilder(S);
		for (int i = S.length() - 1; i >= TARGET.length() - 1; i--) {
			if (isMatch(result.substring(i + 1 - TARGET.length(), i + 1))) {
				for (int j = 0; j < TARGET.length(); j++) {
					result.setCharAt(i + 1 - TARGET.length() + j, TARGET.charAt(j));
				}
			}
		}
		return result.toString().replace('?', 'A');
	}

	static boolean isMatch(String pattern) {
		return IntStream.range(0, TARGET.length())
				.allMatch(i -> pattern.charAt(i) == '?' || pattern.charAt(i) == TARGET.charAt(i));
	}
}
