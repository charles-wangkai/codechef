import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String X = sc.next();
			String Y = sc.next();

			System.out.println(solve(X, Y));
		}

		sc.close();
	}

	static String solve(String X, String Y) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < X.length(); i++) {
			if (X.charAt(i) == 'B' && Y.charAt(i) == 'B') {
				result.append('W');
			} else {
				result.append('B');
			}
		}
		return result.toString();
	}
}
