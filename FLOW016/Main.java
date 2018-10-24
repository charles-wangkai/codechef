import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(solve(A, B));
		}

		sc.close();
	}

	static String solve(int A, int B) {
		int g = gcd(A, B);

		return String.format("%d %d", g, (long) A * B / g);
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}
