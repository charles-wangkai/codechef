import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int K = sc.nextInt();
			int N = sc.nextInt();
			int[] P = new int[N];
			int[] C = new int[N];
			for (int i = 0; i < N; i++) {
				P[i] = sc.nextInt();
				C[i] = sc.nextInt();
			}

			System.out.println(solve(X, Y, K, P, C) ? "LuckyChef" : "UnluckyChef");
		}

		sc.close();
	}

	static boolean solve(int X, int Y, int K, int[] P, int[] C) {
		return IntStream.range(0, P.length).anyMatch(i -> C[i] <= K && Y + P[i] >= X);
	}
}
