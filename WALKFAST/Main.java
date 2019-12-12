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
			int D = sc.nextInt();
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int Y = sc.nextInt();
			int[] x = new int[N + 1];
			for (int i = 1; i < x.length; i++) {
				x[i] = sc.nextInt();
			}

			System.out.println(solve(x, A, B, C, D, P, Q, Y));
		}

		sc.close();
	}

	static int solve(int[] x, int A, int B, int C, int D, int P, int Q, int Y) {
		int result = Math.abs(x[A] - x[B]) * P;
		if (Math.abs(x[A] - x[C]) * P <= Y) {
			result = Math.min(result, Y + Math.abs(x[C] - x[D]) * Q + Math.abs(x[D] - x[B]) * P);
		}

		return result;
	}
}
