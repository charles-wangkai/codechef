import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long N = sc.nextLong();
			int A = sc.nextInt();
			int B = sc.nextInt();
			long K = sc.nextLong();

			System.out.println(solve(N, A, B, K) ? "Win" : "Lose");
		}

		sc.close();
	}

	static boolean solve(long N, int A, int B, long K) {
		return N / A + N / B - N / lcm(A, B) * 2 >= K;
	}

	static long lcm(int a, int b) {
		return (long) a / gcd(a, b) * b;
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}
