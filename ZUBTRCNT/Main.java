import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int L = sc.nextInt();
			int K = sc.nextInt();

			System.out.println("Case " + (tc + 1) + ": " + solve(L, K));
		}

		sc.close();
	}

	static int solve(int L, int K) {
		int n = Math.max(0, L - K + 1);
		return n * (n + 1) / 2;
	}
}
