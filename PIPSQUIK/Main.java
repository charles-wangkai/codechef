import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int H = sc.nextInt();
			int Y1 = sc.nextInt();
			int Y2 = sc.nextInt();
			int L = sc.nextInt();
			int[] t = new int[N];
			int[] X = new int[N];
			for (int i = 0; i < N; i++) {
				t[i] = sc.nextInt();
				X[i] = sc.nextInt();
			}

			System.out.println(solve(t, X, H, Y1, Y2, L));
		}

		sc.close();
	}

	static int solve(int[] t, int[] X, int H, int Y1, int Y2, int L) {
		int result = 0;
		for (int i = 0; i < t.length; i++) {
			boolean needBreak = (t[i] == 1 && X[i] < H - Y1) || (t[i] == 2 && X[i] > Y2);
			if (needBreak) {
				if (L == 1) {
					break;
				}

				L--;
			}

			result++;
		}

		return result;
	}
}
