import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();

			System.out.println(solve(a, b, n));
		}

		sc.close();
	}

	static int solve(int a, int b, int n) {
		int cmp;
		if (n % 2 == 0) {
			cmp = Integer.compare(Math.abs(a), Math.abs(b));
		} else {
			cmp = Integer.compare(a, b);
		}

		if (cmp < 0) {
			return 2;
		} else if (cmp > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
