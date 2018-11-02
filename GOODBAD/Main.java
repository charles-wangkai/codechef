import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			int K = sc.nextInt();
			String s = sc.next();

			System.out.println(solve(s, K));
		}

		sc.close();
	}

	static String solve(String s, int K) {
		int lowerCaseCount = (int) s.chars().filter(ch -> Character.isLowerCase(ch)).count();
		int upperCaseCount = (int) s.chars().filter(ch -> Character.isUpperCase(ch)).count();

		if (lowerCaseCount <= K) {
			if (upperCaseCount <= K) {
				return "both";
			} else {
				return "brother";
			}
		} else {
			if (upperCaseCount <= K) {
				return "chef";
			} else {
				return "none";
			}
		}
	}
}
