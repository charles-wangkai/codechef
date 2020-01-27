import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; ++tc) {
			int N = sc.nextInt();
			int[] S = new int[N];
			int[] P = new int[N];
			int[] V = new int[N];
			for (int i = 0; i < N; ++i) {
				S[i] = sc.nextInt();
				P[i] = sc.nextInt();
				V[i] = sc.nextInt();
			}

			System.out.println(solve(S, P, V));
		}

		sc.close();
	}

	static int solve(int[] S, int[] P, int[] V) {
		return IntStream.range(0, S.length).map(i -> P[i] / (S[i] + 1) * V[i]).max().getAsInt();
	}
}
