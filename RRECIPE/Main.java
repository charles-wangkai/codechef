import java.util.Scanner;

public class Main {
	static final int MOD_DIVISOR = 10000009;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String ingredients = sc.next();

			System.out.println(solve(ingredients));
		}

		sc.close();
	}

	static int solve(String ingredients) {
		int result = 1;
		for (int i = 0, j = ingredients.length() - 1; i <= j; i++, j--) {
			char chI = ingredients.charAt(i);
			char chJ = ingredients.charAt(j);

			if (chI == '?') {
				if (chJ == '?') {
					result = multiplyMod(result, 26);
				}
			} else {
				if (chJ != '?' && chI != chJ) {
					return 0;
				}
			}
		}
		return result;
	}

	static int multiplyMod(int x, int y) {
		return (int) ((long) x * y % MOD_DIVISOR);
	}
}
