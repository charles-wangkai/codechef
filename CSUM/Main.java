import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

			System.out.println(solve(A, K) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(int[] A, int K) {
		Set<Integer> seen = new HashSet<Integer>();
		for (int ai : A) {
			if (seen.contains(K - ai)) {
				return true;
			}

			seen.add(ai);
		}
		return false;
	}
}
