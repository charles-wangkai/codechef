import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		int[] P = new int[N];
		for (int i = 0; i < N; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		System.out.println(solve(m, c, X, Y, P));

		sc.close();
	}

	static int solve(int m, int c, int[] X, int[] Y, int[] P) {
		int village1 = 0;
		int village2 = 0;
		for (int i = 0; i < X.length; ++i) {
			if (m * X[i] + c < Y[i]) {
				village1 += P[i];
			} else {
				village2 += P[i];
			}
		}

		return Math.max(village1, village2);
	}
}
