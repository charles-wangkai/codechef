import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String expression = sc.next();

			System.out.println(solve(expression));
		}

		sc.close();
	}

	static int solve(String expression) {
		int result = 0;
		int depth = 0;
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '<') {
				depth++;
			} else {
				depth--;

				if (depth == 0) {
					result = i + 1;
				} else if (depth < 0) {
					break;
				}
			}
		}
		return result;
	}
}
