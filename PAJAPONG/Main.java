import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(X, Y, K));
		}

		sc.close();
	}

	static String solve(int X, int Y, int K) {
		return ((X + Y) / K % 2 == 0) ? "Chef" : "Paja";
	}
}
