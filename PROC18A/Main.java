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

	static int solve(int[] a, int K) {
		int result = 0;
		int sum = 0;
		int beginIndex = 0;
		for (int endIndex = 0; endIndex < a.length; endIndex++) {
			sum += a[endIndex];

			if (endIndex - beginIndex == K) {
				sum -= a[beginIndex];
				beginIndex++;
			}

			result = Math.max(result, sum);
		}
		return result;
	}
}
