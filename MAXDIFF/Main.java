import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] W = new int[N];
			for (int i = 0; i < W.length; i++) {
				W[i] = sc.nextInt();
			}

			System.out.println(solve(W, K));
		}

		sc.close();
	}

	static int solve(int[] W, int K) {
		return Arrays.stream(W).sum() - Arrays.stream(W).sorted().limit(Math.min(K, W.length - K)).sum() * 2;
	}
}
