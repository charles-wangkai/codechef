import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] a = new int[N];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(solve(a, K));
		}

		sc.close();
	}

	static String solve(int[] a, int K) {
		int minDiff = Integer.MAX_VALUE;
		int pairCount = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int diff = Math.abs(a[i] + a[j] - K);

				if (diff < minDiff) {
					minDiff = diff;
					pairCount = 1;
				} else if (diff == minDiff) {
					pairCount++;
				}
			}
		}

		return String.format("%d %d", minDiff, pairCount);
	}
}
