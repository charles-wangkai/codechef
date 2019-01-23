import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long n1 = sc.nextLong();
			long n2 = sc.nextLong();
			int m = sc.nextInt();

			System.out.println(solve(n1, n2, m));
		}

		sc.close();
	}

	static long solve(long n1, long n2, int m) {
		return n1 + n2 - 2 * Math.min(Math.min(n1, n2), m * (m + 1L) / 2);
	}
}
