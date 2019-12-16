import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] p = new int[N];
			int[] s = new int[N];
			for (int i = 0; i < N; i++) {
				p[i] = sc.nextInt();
				s[i] = sc.nextInt();
			}

			System.out.println(solve(p, s));
		}

		sc.close();
	}

	static int solve(int[] p, int[] s) {
		int[] scores = new int[9];
		for (int i = 0; i < p.length; i++) {
			if (p[i] < scores.length) {
				scores[p[i]] = Math.max(scores[p[i]], s[i]);
			}
		}

		return Arrays.stream(scores).sum();
	}
}
