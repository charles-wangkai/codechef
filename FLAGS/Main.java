import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static long solve(int N) {
		return computeWaysForPattern1(N) + computeWaysForPattern2(N) + computeWaysForPattern3(N)
				+ computeWaysForPattern4(N) + computeWaysForPattern5(N);
	}

	static long computeWaysForPattern1(int N) {
		if (N < 2) {
			return 0;
		}

		return (long) N * (N - 1) * (N - 1);
	}

	static long computeWaysForPattern2(int N) {
		if (N < 2) {
			return 0;
		}

		return (long) N * (N - 1) * (N - 1);
	}

	static long computeWaysForPattern3(int N) {
		if (N < 3) {
			return 0;
		}

		return (long) N * (N - 1) * (N - 2);
	}

	static long computeWaysForPattern4(int N) {
		if (N < 3) {
			return 0;
		}

		return (long) N * (N - 1) * (N - 2) * (N - 2);
	}

	static long computeWaysForPattern5(int N) {
		if (N < 3) {
			return 0;
		}

		return (long) N * (N - 1) * (N - 2) * (N - 2);
	}
}
