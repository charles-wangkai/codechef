import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String[] S = new String[N];
			for (int i = 0; i < S.length; i++) {
				S[i] = sc.next();
			}

			System.out.println(solve(S));
		}

		sc.close();
	}

	static int solve(String[] S) {
		return Integer
				.bitCount(Arrays.stream(S).mapToInt(s -> Integer.parseInt(s, 2)).reduce((x, y) -> x ^ y).getAsInt());
	}
}
