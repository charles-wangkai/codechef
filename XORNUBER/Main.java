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
		if (N == 1) {
			return 2;
		}

		if (Integer.bitCount(N + 1) == 1) {
			return (N + 1) / 2 - 1;
		} else {
			return -1;
		}
	}
}
