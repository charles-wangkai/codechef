import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long l = sc.nextLong();
			long r = sc.nextLong();
			long g = sc.nextLong();

			System.out.println(solve(l, r, g));
		}

		sc.close();
	}

	static long solve(long l, long r, long g) {
		long minDivisor = l / g + ((l % g == 0) ? 0 : 1);
		long maxDivisor = r / g;

		if (minDivisor < maxDivisor || (minDivisor == 1 && maxDivisor == 1)) {
			return (maxDivisor - minDivisor) + 1;
		} else {
			return 0;
		}
	}
}
