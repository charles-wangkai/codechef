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
		boolean[] mistakes = new boolean[A.length];
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] != A[i + 1]) {
				mistakes[i] = true;
				mistakes[i + 1] = true;
			}
		}

		return (int) IntStream.range(0, mistakes.length).filter(i -> mistakes[i]).count();
	}
}
