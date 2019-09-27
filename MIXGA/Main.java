import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A, K));
		}

		sc.close();
	}

	static int solve(int[] A, int K) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				continue;
			}

			if (i % 2 == 0) {
				sum++;
			} else {
				if (sum > 0) {
					sum--;
				} else {
					sum++;
				}
			}
		}

		return (Math.abs(sum) >= K) ? 1 : 2;
	}
}
