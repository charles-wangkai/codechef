import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; ++tc) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();

			System.out.println(solve(l, r, k));
		}

		sc.close();
	}

	static int solve(int l, int r, int k) {
		return (l == r) ? 1 : k;
	}
}
