import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(N, A, K));
		}

		sc.close();
	}

	static String solve(int N, int A, int K) {
		int numerator = -2 * A * K * N + A * N * N + A * N + 360 * K * N - 720 * K - 360 * N + 720;
		int denominator = N * (N - 1);

		int g = gcd(numerator, denominator);
		numerator /= g;
		denominator /= g;

		return String.format("%d %d", numerator, denominator);
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}
