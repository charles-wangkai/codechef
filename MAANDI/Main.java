import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();

			System.out.println(solve(n));
		}

		sc.close();
	}

	static int solve(int n) {
		int result = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				if (isOverlucky(i)) {
					result++;
				}

				if (i * i != n && isOverlucky(n / i)) {
					result++;
				}
			}
		}
		return result;
	}

	static boolean isOverlucky(int x) {
		return String.valueOf(x).chars().anyMatch(ch -> ch == '4' || ch == '7');
	}
}
