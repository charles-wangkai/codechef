import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			int M = sc.nextInt();

			System.out.println(solve(N, B, M));
		}

		sc.close();
	}

	static long solve(int N, int B, int M) {
		long result = 0;
		long speed = M;
		while (N != 0) {
			if (result != 0) {
				result += B;
			}

			int finishedProblem = (N + 1) / 2;
			result += finishedProblem * speed;

			N -= finishedProblem;
			speed *= 2;
		}
		return result;
	}
}
