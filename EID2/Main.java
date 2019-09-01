import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A1 = sc.nextInt();
			int A2 = sc.nextInt();
			int A3 = sc.nextInt();
			int C1 = sc.nextInt();
			int C2 = sc.nextInt();
			int C3 = sc.nextInt();

			System.out.println(solve(A1, A2, A3, C1, C2, C3) ? "FAIR" : "NOT FAIR");
		}

		sc.close();
	}

	static boolean solve(int A1, int A2, int A3, int C1, int C2, int C3) {
		if (A2 < A1 && A2 <= A3) {
			return solve(A2, A1, A3, C2, C1, C3);
		}
		if (A3 < A1 && A3 <= A2) {
			return solve(A3, A1, A2, C3, C1, C2);
		}
		if (A3 < A2) {
			return solve(A1, A3, A2, C1, C3, C2);
		}

		return ((A1 == A2 && C1 == C2) || (A1 != A2 && C1 < C2)) && ((A2 == A3 && C2 == C3) || (A2 != A3 && C2 < C3));
	}
}
