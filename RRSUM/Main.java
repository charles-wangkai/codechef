import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int tc = 0; tc < M; tc++) {
			long q = sc.nextLong();

			System.out.println(solve(N, q));
		}

		sc.close();
	}

	static long solve(int N, long q) {
		if (q < N + 2) {
			return 0;
		} else if (q <= 2 * N + 1) {
			return q - (N + 1);
		} else {
			return (3L * N + 1) - q;
		}
	}
}
