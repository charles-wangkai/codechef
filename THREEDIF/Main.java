import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static final int MOD_DIVISOR = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long N1 = sc.nextLong();
			long N2 = sc.nextLong();
			long N3 = sc.nextLong();

			System.out.println(solve(N1, N2, N3));
		}

		sc.close();
	}

	static int solve(long N1, long N2, long N3) {
		return BigInteger.valueOf(N1).multiply(BigInteger.valueOf(N2)).multiply(BigInteger.valueOf(N3))
				.subtract(computeOnePairNum(N1, N2, N3)).subtract(computeOnePairNum(N2, N3, N1))
				.subtract(computeOnePairNum(N3, N1, N2)).subtract(BigInteger.valueOf(Math.min(Math.min(N1, N2), N3)))
				.mod(BigInteger.valueOf(MOD_DIVISOR)).intValue();
	}

	static BigInteger computeOnePairNum(long a, long b, long c) {
		long maxPairValue = Math.min(a, b);

		if (maxPairValue <= c) {
			return BigInteger.valueOf(maxPairValue).multiply(BigInteger.valueOf(c - 1));
		} else {
			return BigInteger.valueOf(c).multiply(BigInteger.valueOf(c - 1))
					.add(BigInteger.valueOf(maxPairValue - c).multiply(BigInteger.valueOf(c)));
		}
	}
}
