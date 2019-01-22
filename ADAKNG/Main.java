import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(R, C, K));
		}

		sc.close();
	}

	static int solve(int R, int C, int K) {
		int minR = Math.max(1, R - K);
		int maxR = Math.min(8, R + K);
		int minC = Math.max(1, C - K);
		int maxC = Math.min(8, C + K);

		return (maxR - minR + 1) * (maxC - minC + 1);
	}
}
