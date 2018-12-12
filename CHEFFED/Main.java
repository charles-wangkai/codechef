import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		System.out.println(solve(N));

		sc.close();
	}

	static int solve(int N) {
		int result = 0;
		for (int X = Math.max(0, N - 100); X <= N; X++) {
			if (X + S(X) + S(S(X)) == N) {
				result++;
			}
		}
		return result;
	}

	static int S(int x) {
		return String.valueOf(x).chars().map(ch -> ch - '0').sum();
	}
}
