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
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static String solve(int[] A) {
		int N = A.length;

		Arrays.sort(A);

		if (IntStream.rangeClosed(1, 3).allMatch(i -> A[N / 4 * i] != A[N / 4 * i - 1])) {
			return IntStream.rangeClosed(1, 3).mapToObj(i -> String.valueOf(A[N / 4 * i]))
					.collect(Collectors.joining(" "));
		} else {
			return "-1";
		}
	}
}
