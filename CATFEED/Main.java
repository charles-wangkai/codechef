import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[M];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(N, A) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(int N, int[] A) {
		boolean[] used = new boolean[N + 1];
		for (int i = 0; i < A.length; i++) {
			if (i % N == 0) {
				Arrays.fill(used, false);
			}

			if (used[A[i]]) {
				return false;
			}
			used[A[i]] = true;
		}

		return true;
	}
}
