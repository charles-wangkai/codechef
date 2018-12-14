import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			System.out.println(solve(l, r));
		}

		sc.close();
	}

	static long solve(int l, int r) {
		long result = 0;
		for (int divisor = 1; divisor <= r; divisor += 2) {
			int lower = l / divisor;
			if (lower * divisor < l) {
				lower++;
			}

			int upper = r / divisor;

			result += Math.max(0L, upper - lower + 1) * divisor;
		}
		return result;
	}
}
