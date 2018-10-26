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

			System.out.println(solve(A) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int[] A) {
		if (A[0] != 1) {
			return false;
		}

		int last = -1;
		for (int i = 0, j = A.length - 1; i <= j; i++, j--) {
			if (A[i] != A[j] || (i > 0 && A[i] != A[i - 1] && A[i] != A[i - 1] + 1)) {
				return false;
			}

			last = A[i];
		}
		return last == 7;
	}
}
