import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] g = new int[N];
			for (int i = 0; i < g.length; i++) {
				g[i] = sc.nextInt();
			}

			System.out.println(solve(g));
		}

		sc.close();
	}

	static String solve(int[] g) {
		int maxDiff = 0;
		int min = g[0];
		for (int i = 1; i < g.length; i++) {
			min = Math.min(min, g[i]);
			maxDiff = Math.max(maxDiff, g[i] - min);
		}
		return (maxDiff == 0) ? "UNFIT" : String.valueOf(maxDiff);
	}
}
