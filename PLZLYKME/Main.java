import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int L = sc.nextInt();
			int D = sc.nextInt();
			int S = sc.nextInt();
			int C = sc.nextInt();

			System.out.println(solve(L, D, S, C) ? "ALIVE AND KICKING" : "DEAD AND ROTTING");
		}

		sc.close();
	}

	static boolean solve(int L, int D, int S, int C) {
		if (S >= L) {
			return true;
		}

		long likes = S;
		for (int i = 0; i < D - 1; i++) {
			likes *= C + 1;

			if (likes >= L) {
				return true;
			}
		}
		return false;
	}
}
