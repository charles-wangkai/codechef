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

	static int solve(int[] A) {
		return IntStream.range(0, A.length - 1)
				.map(i -> IntStream.range(i + 1, A.length)
						.map(j -> String.valueOf(A[i] * A[j]).chars().map(ch -> ch - '0').sum()).max().getAsInt())
				.max().getAsInt();
	}
}
