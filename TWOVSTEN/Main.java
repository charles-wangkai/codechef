import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int X = sc.nextInt();

			System.out.println(solve(X));
		}

		sc.close();
	}

	static int solve(int X) {
		if (X % 10 == 0) {
			return 0;
		} else if (X % 5 == 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
