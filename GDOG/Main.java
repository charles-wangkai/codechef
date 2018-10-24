import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(N, K));
		}

		sc.close();
	}

	static int solve(int N, int K) {
		return IntStream.rangeClosed(1, K).map(peopleNum -> N % peopleNum).max().getAsInt();
	}
}
