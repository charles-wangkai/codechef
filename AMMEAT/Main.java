import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			long M = sc.nextLong();
			long[] P = new long[N];
			for (int i = 0; i < P.length; i++) {
				P[i] = sc.nextLong();
			}

			System.out.println(solve(P, M));
		}

		sc.close();
	}

	static int solve(long[] P, long M) {
		Arrays.sort(P);

		long sum = 0;
		for (int i = P.length - 1; i >= 0; i--) {
			sum += P[i];

			if (sum >= M) {
				return P.length - i;
			}
		}
		return -1;
	}
}
