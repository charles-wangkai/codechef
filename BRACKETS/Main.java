import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String A = sc.next();

			System.out.println(solve(A));
		}

		sc.close();
	}

	static String solve(String A) {
		int maxBalance = computeMaxBalance(A);

		return repeat('(', maxBalance) + repeat(')', maxBalance);
	}

	static int computeMaxBalance(String A) {
		int balance = 0;
		int maxBalance = 0;
		for (char ch : A.toCharArray()) {
			if (ch == '(') {
				balance++;
			} else if (ch == ')') {
				balance--;
			}

			maxBalance = Math.max(maxBalance, balance);
		}
		return maxBalance;
	}

	static String repeat(char ch, int count) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < count; i++) {
			result.append(ch);
		}
		return result.toString();
	}
}
