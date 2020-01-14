import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; ++tc) {
			int S = sc.nextInt();
			int W1 = sc.nextInt();
			int W2 = sc.nextInt();
			int W3 = sc.nextInt();

			System.out.println(solve(S, W1, W2, W3));
		}

		sc.close();
	}

	static int solve(int S, int W1, int W2, int W3) {
		if (W1 + W2 + W3 <= S) {
			return 1;
		} else if (W1 + W2 <= S || W2 + W3 <= S) {
			return 2;
		} else {
			return 3;
		}
	}
}
