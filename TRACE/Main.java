import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[][] A = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static int solve(int[][] A) {
		int N = A.length;
		int result = -1;
		for (int j = 0; j < N; j++) {
			result = Math.max(result, computeDiagonalSum(A, 0, j));
		}
		for (int i = 0; i < N; i++) {
			result = Math.max(result, computeDiagonalSum(A, i, 0));
		}
		return result;
	}

	static int computeDiagonalSum(int[][] A, int beginR, int beginC) {
		int N = A.length;
		int diagonalSum = 0;
		for (int i = beginR, j = beginC; i < N && j < N; i++, j++) {
			diagonalSum += A[i][j];
		}
		return diagonalSum;
	}
}
