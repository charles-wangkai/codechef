import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	static final int X_LIMIT = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int[] D = readArray(sc, N);
			int[] X = readArray(sc, Q);

			System.out.println(String.join(" ",
					Arrays.stream(solve(D, X)).mapToObj(String::valueOf).collect(Collectors.toList())));
		}

		sc.close();
	}

	static int[] readArray(Scanner sc, int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static int[] solve(int[] D, int[] X) {
		long divisor = 1;
		for (int elemD : D) {
			divisor *= elemD;

			if (divisor > X_LIMIT) {
				return IntStream.range(0, X.length).map(i -> 0).toArray();
			}
		}

		int divisorInt = (int) divisor;
		return IntStream.range(0, X.length).map(i -> X[i] / divisorInt).toArray();
	}
}
