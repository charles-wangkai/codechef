import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			System.out.println(solve(x, y));
		}

		sc.close();
	}

	static int solve(int x, int y) {
		for (int sum = x + y + 1;; sum++) {
			if (isPrime(sum)) {
				return sum - x - y;
			}
		}
	}

	static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
