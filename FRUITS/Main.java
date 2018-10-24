import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(N, M, K));
		}

		sc.close();
	}

	static int solve(int N, int M, int K) {
		return Math.max(0, Math.abs(N - M) - K);
	}
}
