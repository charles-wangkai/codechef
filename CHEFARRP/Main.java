import java.util.Scanner;

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
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			int sum = 0;
			int product = 1;
			for (int j = i; j < A.length; j++) {
				sum += A[j];
				product *= A[j];

				if (sum == product) {
					result++;
				}
			}
		}
		return result;
	}
}
