import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] L = new int[N];
			int[] R = new int[N];
			for (int i = 0; i < N; i++) {
				L[i] = sc.nextInt();
				R[i] = sc.nextInt();
			}
			int[] P = new int[M];
			for (int i = 0; i < P.length; i++) {
				P[i] = sc.nextInt();
			}

			System.out.println(solve(L, R, P));
		}

		sc.close();
	}

	static String solve(int[] L, int[] R, int[] P) {
		Interval[] intervals = IntStream.range(0, L.length).mapToObj(i -> new Interval(L[i], R[i]))
				.sorted((interval1, interval2) -> Integer.compare(interval1.left, interval2.left))
				.toArray(Interval[]::new);

		return Arrays.stream(P).mapToObj(arriveTime -> String.valueOf(computeWaitTime(intervals, arriveTime)))
				.collect(Collectors.joining("\n"));
	}

	static int computeWaitTime(Interval[] intervals, int arriveTime) {
		int result = -1;
		int lowerIndex = 0;
		int upperIndex = intervals.length - 1;
		while (lowerIndex <= upperIndex) {
			int middleIndex = (lowerIndex + upperIndex) / 2;

			if (arriveTime < intervals[middleIndex].right) {
				result = Math.max(0, intervals[middleIndex].left - arriveTime);

				upperIndex = middleIndex - 1;
			} else {
				lowerIndex = middleIndex + 1;
			}
		}

		return result;
	}
}

class Interval {
	int left;
	int right;

	Interval(int left, int right) {
		this.left = left;
		this.right = right;
	}
}