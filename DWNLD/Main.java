import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();
		for (int tc = 0; tc < TC; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] T = new int[N];
			int[] D = new int[N];
			for (int i = 0; i < N; i++) {
				T[i] = sc.nextInt();
				D[i] = sc.nextInt();
			}

			System.out.println(solve(K, T, D));
		}

		sc.close();
	}

	static int solve(int K, int[] T, int[] D) {
		int result = 0;
		int chargedMinute = -K;
		for (int i = 0; i < T.length; i++) {
			chargedMinute += T[i];

			if (chargedMinute > 0) {
				result += chargedMinute * D[i];
				chargedMinute = 0;
			}
		}
		return result;
	}
}
