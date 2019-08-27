import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String S) {
		return buildKey(S.substring(0, S.length() / 2)).equals(buildKey(S.substring(S.length() - S.length() / 2)));
	}

	static String buildKey(String str) {
		return str.chars().sorted().map(ch -> (char) ch)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
	}
}
