import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			System.out.println(solve(n, m) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(int n, int m) {
		return n % 2 == 0 || m % 2 == 0;
	}
}
