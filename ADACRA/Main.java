import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S));
		}

		sc.close();
	}

	static int solve(String S) {
		return ((int) IntStream.range(0, S.length() - 1).filter(i -> S.charAt(i) != S.charAt(i + 1)).count() + 1) / 2;
	}
}
