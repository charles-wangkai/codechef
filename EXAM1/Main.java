import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			String S = sc.next();
			String U = sc.next();

			System.out.println(solve(S, U));
		}

		sc.close();
	}

	static int solve(String S, String U) {
		int result = 0;
		int index = 0;
		while (index < S.length()) {
			if (U.charAt(index) == S.charAt(index)) {
				result++;
			} else if (U.charAt(index) != 'N') {
				index++;
			}

			index++;
		}
		return result;
	}
}
