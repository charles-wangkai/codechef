import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static long solve(int N) {
		long result = 0;
		for (int i = 1; i * i <= N; i++) {
			if (N % i == 0) {
				result += i;

				if (N / i != i) {
					result += N / i;
				}
			}
		}

		return result;
	}
}
