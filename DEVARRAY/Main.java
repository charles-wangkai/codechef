import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		int min = Arrays.stream(A).min().getAsInt();
		int max = Arrays.stream(A).max().getAsInt();

		for (int tc = 0; tc < Q; tc++) {
			int t = sc.nextInt();

			System.out.println(solve(min, max, t) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(int min, int max, int t) {
		return t >= min && t <= max;
	}
}
