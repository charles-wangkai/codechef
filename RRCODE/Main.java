import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int Answer = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}
			String Operator = sc.next();

			System.out.println(solve(A, K, Answer, Operator));
		}

		sc.close();
	}

	static int solve(int[] A, int K, int Answer, String Operator) {
		if (K == 0) {
			return Answer;
		}

		if (Operator.equals("XOR")) {
			if (K % 2 != 0) {
				return Arrays.stream(A).reduce(Answer, (x, y) -> x ^ y);
			} else {
				return Answer;
			}
		} else if (Operator.equals("AND")) {
			return Arrays.stream(A).reduce(Answer, (x, y) -> x & y);
		} else {
			return Arrays.stream(A).reduce(Answer, (x, y) -> x | y);
		}
	}
}
