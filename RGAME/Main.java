import java.util.Scanner;

public class Main {
	static final int MOD_DIVISOR = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] A = new int[N + 1];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static int solve(int[] A) {
		int result = 0;
		int cumulative = A[0];
		int power2 = 1;
		for (int i = 1; i < A.length; i++) {
			result = addMod(multiplyMod(result, 2), multiplyMod(A[i], cumulative));

			cumulative = addMod(cumulative, multiplyMod(A[i], power2));
			power2 = multiplyMod(power2, 2);
		}
		return multiplyMod(result, 2);
	}

	static int multiplyMod(int x, int y) {
		return (int) ((long) x * y % MOD_DIVISOR);
	}

	static int addMod(int x, int y) {
		return (x + y) % MOD_DIVISOR;
	}
}
