import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Q = sc.nextInt();
		for (int tc = 0; tc < Q; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(solve(a, b) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(int a, int b) {
		if (a > b) {
			return solve(b, a);
		}

		return a + 2 == b || (a + 1 == b && a % 2 != 0 && b % 2 == 0);
	}
}
