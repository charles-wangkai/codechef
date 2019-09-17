import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A, K));
		}

		sc.close();
	}

	static long solve(int[] A, int K) {
		Arrays.sort(A);

		int target = A[K - 1];
		return C((int) Arrays.stream(A).filter(x -> x == target).count(),
				(int) IntStream.range(0, K).filter(i -> A[i] == target).count());
	}

	static long C(int n, int r) {
		long result = 1;
		for (int i = 0; i < r; i++) {
			result = result * (n - i) / (i + 1);
		}

		return result;
	}
}
