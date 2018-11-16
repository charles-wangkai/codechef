import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		String M = sc.next();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(M, S));
		}

		sc.close();
	}

	static String solve(String M, String S) {
		StringBuilder result = new StringBuilder();
		for (char ch : S.toCharArray()) {
			if (Character.isLetter(ch)) {
				char lower = Character.toLowerCase(ch);

				result.append((char) (ch - lower + M.charAt(lower - 'a')));
			} else if (ch == '_') {
				result.append(' ');
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}
}
