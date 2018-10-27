import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String S) {
		return S.charAt(0) != S.charAt(1)
				&& IntStream.range(2, S.length()).allMatch(i -> S.charAt(i) == S.charAt(i - 2));
	}
}
