import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int LIMIT = 100000;

	static int[][] primeFactorNumSums = buildPrimeFactorNumSums();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(A, B, K));
		}

		sc.close();
	}

	static int[][] buildPrimeFactorNumSums() {
		int[] primeFactorNums = new int[LIMIT + 1];
		boolean[] primes = new boolean[primeFactorNums.length];
		Arrays.fill(primes, true);
		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				for (int j = i; j < primes.length; j += i) {
					primes[j] = false;
					primeFactorNums[j]++;
				}
			}
		}

		int maxPrimeFactorNum = Arrays.stream(primeFactorNums).max().getAsInt();
		int[][] primeFactorNumSums = new int[primeFactorNums.length][maxPrimeFactorNum + 1];
		for (int i = 2; i < primeFactorNumSums.length; i++) {
			for (int j = 0; j <= maxPrimeFactorNum; j++) {
				primeFactorNumSums[i][j] = primeFactorNumSums[i - 1][j];
			}

			primeFactorNumSums[i][primeFactorNums[i]]++;
		}
		return primeFactorNumSums;
	}

	static int solve(int A, int B, int K) {
		return primeFactorNumSums[B][K] - primeFactorNumSums[A - 1][K];
	}
}
