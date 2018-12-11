
// http://oeis.org/A027383

import java.util.Scanner;

public class Main {
	static final int MOD_DIVISOR = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static int solve(int N) {
		return subtractMod(addMod(powMod(2, (N + 2) / 2), powMod(2, (N + 1) / 2)), 2);
	}

	static int powMod(int base, int exponent) {
		int result = 1;
		while (exponent != 0) {
			if (exponent % 2 != 0) {
				result = multiplyMod(result, base);
			}

			base = multiplyMod(base, base);
			exponent /= 2;
		}
		return result;
	}

	static int multiplyMod(int x, int y) {
		return (int) ((long) x * y % MOD_DIVISOR);
	}

	static int addMod(int x, int y) {
		return (x + y) % MOD_DIVISOR;
	}

	static int subtractMod(int x, int y) {
		return (x - y + MOD_DIVISOR) % MOD_DIVISOR;
	}
}
