import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int C = sc.nextInt();
			int Q = sc.nextInt();
			int[] L = new int[Q];
			int[] R = new int[Q];
			for (int i = 0; i < Q; i++) {
				L[i] = sc.nextInt();
				R[i] = sc.nextInt();
			}

			System.out.println(solve(N, C, L, R));
		}

		sc.close();
	}

	static int solve(int N, int C, int[] L, int[] R) {
		for (int i = 0; i < L.length; i++) {
			if (C >= L[i] && C <= R[i]) {
				C = L[i] + R[i] - C;
			}
		}
		return C;
	}
}
