import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int H = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A, H));
		}

		sc.close();
	}

	static int solve(int[] A, int H) {
		int result = -1;
		int lower = 1;
		int upper = Arrays.stream(A).max().getAsInt();
		while (lower <= upper) {
			int middle = (lower + upper) / 2;

			if (Arrays.stream(A).map(x -> divideToCeil(x, middle)).asLongStream().sum() <= H) {
				result = middle;

				upper = middle - 1;
			} else {
				lower = middle + 1;
			}
		}

		return result;
	}

	static int divideToCeil(int x, int y) {
		return x / y + (x % y == 0 ? 0 : 1);
	}
}
