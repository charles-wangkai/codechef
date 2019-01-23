import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] D = new int[N];
			for (int i = 0; i < D.length; i++) {
				D[i] = sc.nextInt();
			}

			System.out.println(solve(D));
		}

		sc.close();
	}

	static long solve(int[] D) {
		long[] leftMaxSums = computeLeftMaxSums(D);
		long[] leftMinSums = negate(computeLeftMaxSums(negate(D)));
		long[] rightMaxSums = reverse(computeLeftMaxSums(reverse(D)));
		long[] rightMinSums = reverse(negate(computeLeftMaxSums(reverse(negate(D)))));

		long maxDiff = Long.MIN_VALUE;
		for (int i = 0; i < D.length - 1; i++) {
			maxDiff = Math.max(maxDiff, Math.max(Math.abs(leftMaxSums[i] - rightMinSums[i + 1]),
					Math.abs(leftMinSums[i] - rightMaxSums[i + 1])));
		}
		return maxDiff;
	}

	static int[] negate(int[] a) {
		return Arrays.stream(a).map(x -> -x).toArray();
	}

	static long[] negate(long[] a) {
		return Arrays.stream(a).map(x -> -x).toArray();
	}

	static int[] reverse(int[] a) {
		return IntStream.range(0, a.length).map(i -> a[a.length - 1 - i]).toArray();
	}

	static long[] reverse(long[] a) {
		return IntStream.range(0, a.length).mapToLong(i -> a[a.length - 1 - i]).toArray();
	}

	static long[] computeLeftMaxSums(int[] a) {
		long[] maxSums = new long[a.length];
		long maxSum = Long.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < maxSums.length; i++) {
			sum += a[i];
			maxSum = Math.max(maxSum, sum);
			maxSums[i] = maxSum;
			sum = Math.max(0, sum);
		}
		return maxSums;
	}
}
