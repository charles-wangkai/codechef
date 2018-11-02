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

	static double solve(int[] A) {
		int maxPairSum = -1;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				maxPairSum = Math.max(maxPairSum, A[i] + A[j]);
			}
		}

		int count = 0;
		int pairNum = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] + A[j] == maxPairSum) {
					count++;
				}

				pairNum++;
			}
		}
		return (double) count / pairNum;
	}
}
