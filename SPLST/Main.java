import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			System.out.println(solve(a, b, c, x, y) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(int a, int b, int c, int x, int y) {
		if (a > b) {
			return solve(b, a, c, x, y);
		} else if (b > c) {
			return solve(a, c, b, x, y);
		} else if (x > y) {
			return solve(a, b, c, y, x);
		}

		return (long) a + b + c == x + y && a <= x && b <= y;
	}
}
