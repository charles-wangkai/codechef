import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long N = sc.nextLong();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static String solve(long N) {
		return String.format("%d%d", N, (10 - String.valueOf(N).chars().map(ch -> ch - '0').sum() % 10) % 10);
	}
}
