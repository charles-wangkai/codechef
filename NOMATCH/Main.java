import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static long solve(int[] A) {
		Arrays.sort(A);

		return IntStream.range(0, A.length / 2).map(i -> A[A.length - 1 - i] - A[i]).asLongStream().sum();
	}
}
