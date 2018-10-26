import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int C = sc.nextInt();
			int D = sc.nextInt();
			int L = sc.nextInt();

			System.out.println(solve(C, D, L) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int C, int D, int L) {
		return L % 4 == 0 && L <= (C + D) * 4L && L >= (Math.max(0, C - D * 2) + D) * 4L;
	}
}
