import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static String[] LEVEL_NAMES = { "Beginner", "Junior Developer", "Middle Developer", "Senior Developer", "Hacker",
			"Jeff Dean" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int tc = 0; tc < N; tc++) {
			int[] A = new int[5];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static String solve(int[] A) {
		return LEVEL_NAMES[Arrays.stream(A).sum()];
	}
}
