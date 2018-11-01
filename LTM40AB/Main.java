import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			System.out.println(solve(a, b, c, d));
		}

		sc.close();
	}

	static long solve(int a, int b, int c, int d) {
		long result = 0;
		for (int x = a; x <= b; x++) {
			result += Math.max(0, d - Math.max(c, x + 1) + 1);
		}
		return result;
	}
}
