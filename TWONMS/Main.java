import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();

			System.out.println(solve(A, B, N));
		}

		sc.close();
	}

	static int solve(int A, int B, int N) {
		if (N % 2 != 0) {
			A *= 2;
		}

		return Math.max(A, B) / Math.min(A, B);
	}
}
