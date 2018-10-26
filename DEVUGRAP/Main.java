import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] grapes = new int[N];
			for (int i = 0; i < grapes.length; i++) {
				grapes[i] = sc.nextInt();
			}

			System.out.println(solve(grapes, K));
		}

		sc.close();
	}

	static long solve(int[] grapes, int K) {
		return Arrays.stream(grapes).map(grape -> {
			int mod = grape % K;
			if (mod < K - mod && grape != mod) {
				return mod;
			} else {
				return K - mod;
			}
		}).asLongStream().sum();
	}
}
