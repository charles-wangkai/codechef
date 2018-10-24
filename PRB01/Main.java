import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int N) {
		if (N < 2) {
			return false;
		}

		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}
}
