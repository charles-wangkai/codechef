import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			String S = sc.next();

			System.out.println(solve(S));
		}

		sc.close();
	}

	static String solve(String S) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < S.length(); i += 2) {
			if (i + 1 < S.length()) {
				result.append(replace(S.charAt(i + 1)));
			}

			result.append(replace(S.charAt(i)));
		}
		return result.toString();
	}

	static char replace(char ch) {
		return (char) ('a' + 'z' - ch);
	}
}
