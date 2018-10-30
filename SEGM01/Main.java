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
		return IntStream.range(0, S.length())
				.filter(i -> S.charAt(i) == '1' && (i == S.length() - 1 || S.charAt(i + 1) == '0')).count() == 1;
	}
}
