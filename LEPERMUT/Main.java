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

			System.out.println(solve(A) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(int[] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 2; j < A.length; j++) {
				if (A[i] > A[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
