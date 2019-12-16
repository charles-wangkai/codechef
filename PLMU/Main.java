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
		int count0 = 0;
		int count2 = 0;
		for (int value : A) {
			if (value == 0) {
				count0++;
			} else if (value == 2) {
				count2++;
			}
		}

		return count0 * (count0 - 1) / 2 + count2 * (count2 - 1) / 2;
	}
}
