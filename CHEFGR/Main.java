import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A, M) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(int[] A, int M) {
		int max = Arrays.stream(A).max().getAsInt();
		int required = Arrays.stream(A).map(x -> max - x).sum();

		return M >= required && (M - required) % A.length == 0;
	}
}
