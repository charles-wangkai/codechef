import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			String S = sc.next();
			char X = sc.next().charAt(0);

			System.out.println(solve(S, X));
		}

		sc.close();
	}

	static long solve(String S, char X) {
		long result = computeSubstringNum(S.length());

		int length = 0;
		for (int i = 0; i <= S.length(); i++) {
			if (i != S.length() && S.charAt(i) != X) {
				length++;
			} else {
				result -= computeSubstringNum(length);

				length = 0;
			}
		}

		return result;
	}

	static long computeSubstringNum(int length) {
		return length * (length - 1L) / 2 + length;
	}
}
