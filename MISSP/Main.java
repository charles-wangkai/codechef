import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] t = new int[N];
			for (int i = 0; i < t.length; i++) {
				t[i] = sc.nextInt();
			}

			System.out.println(solve(t));
		}

		sc.close();
	}

	static int solve(int[] t) {
		return Arrays.stream(t).reduce(0, (x, y) -> x ^ y);
	}
}
