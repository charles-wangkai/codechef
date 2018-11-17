import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] W = new int[N];
			for (int i = 0; i < W.length; i++) {
				W[i] = sc.nextInt();
			}

			System.out.println(solve(W));
		}

		sc.close();
	}

	static int solve(int[] W) {
		return IntStream.range(0, W.length).map(i -> i + W[i]).max().getAsInt();
	}
}
