import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			System.out.println(solve(N, A, B, C));
		}

		sc.close();
	}

	static long solve(int N, int A, int B, int C) {
		long result = 0;
		for (int a = 0; a <= A; a++) {
			for (int b = 0; b <= B; b++) {
				result += Math.max(-1, Math.min(C, N - a - b)) + 1;
			}
		}
		return result;
	}
}
