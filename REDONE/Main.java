import java.util.Scanner;

public class Main {
	static final int MOD_DIVISOR = 1_000_000_007;
	static final int LIMIT = 1_000_000;

	static int[] solutions = buildSolutions();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static int[] buildSolutions() {
		int[] solutions = new int[LIMIT + 1];
		for (int i = 1; i < solutions.length; i++) {
			solutions[i] = reduce(solutions[i - 1], i);
		}
		return solutions;
	}

	static int reduce(int x, int y) {
		return addMod(addMod(x, y), multiplyMod(x, y));
	}

	static int addMod(int x, int y) {
		return (x + y) % MOD_DIVISOR;
	}

	static int multiplyMod(int x, int y) {
		return (int) ((long) x * y % MOD_DIVISOR);
	}

	static int solve(int N) {
		return solutions[N];
	}
}
