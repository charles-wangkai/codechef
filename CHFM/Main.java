import java.util.Arrays;
import java.util.OptionalInt;
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

	static String solve(int[] A) {
		long sum = Arrays.stream(A).asLongStream().sum();

		OptionalInt index = IntStream.range(0, A.length).filter(i -> (long) A[i] * A.length == sum).findFirst();
		return index.isPresent() ? String.valueOf(index.getAsInt() + 1) : "Impossible";
	}
}
