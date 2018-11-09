import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static int solve(int N) {
		for (int i = N + 1;; i++) {
			if (String.valueOf(i).chars().filter(ch -> ch == '3').count() >= 3) {
				return i;
			}
		}
	}
}
