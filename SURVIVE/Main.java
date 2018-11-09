import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int S = sc.nextInt();

			System.out.println(solve(N, K, S));
		}

		sc.close();
	}

	static int solve(int N, int K, int S) {
		if (S <= 6) {
			if (N < K) {
				return -1;
			}
		} else {
			if (N * 6 < K * 7) {
				return -1;
			}
		}

		return divideToCeil(K * S, N);
	}

	static int divideToCeil(int x, int y) {
		return x / y + ((x % y == 0) ? 0 : 1);
	}
}
