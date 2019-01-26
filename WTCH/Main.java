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

	static int solve(String S) {
		StringBuilder sb = new StringBuilder(S);
		int result = 0;
		for (int i = 0; i < S.length(); i++) {
			if (!isOccupied(sb, i) && !isOccupied(sb, i - 1) && !isOccupied(sb, i + 1)) {
				sb.setCharAt(i, '1');
				result++;
			}
		}
		return result;
	}

	static boolean isOccupied(StringBuilder sb, int index) {
		return index >= 0 && index < sb.length() && sb.charAt(index) == '1';
	}
}
