import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; ++tc) {
			String S = sc.next();

			System.out.println(solve(S) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String S) {
		StringBuilder compressed = new StringBuilder();
		char current = 0;
		int count = -1;
		for (int i = 0; i <= S.length(); ++i) {
			if (i != S.length() && S.charAt(i) == current) {
				count++;
			} else {
				if (count > 0) {
					compressed.append(current).append(count);
				}

				if (i != S.length()) {
					current = S.charAt(i);
					count = 1;
				}
			}
		}

		return compressed.length() < S.length();
	}
}
