import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String expected = sc.next();
			String actual = sc.next();
			int[] W = new int[N + 1];
			for (int i = 0; i < W.length; i++) {
				W[i] = sc.nextInt();
			}

			System.out.println(solve(expected, actual, W));
		}

		sc.close();
	}

	static int solve(String expected, String actual, int[] W) {
		if (expected.equals(actual)) {
			return W[W.length - 1];
		} else {
			return IntStream
					.rangeClosed(0,
							(int) IntStream.range(0, expected.length())
									.filter(i -> expected.charAt(i) == actual.charAt(i)).count())
					.map(i -> W[i]).max().getAsInt();
		}
	}
}
