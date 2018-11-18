import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String word = sc.next();

			System.out.println(solve(word) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String word) {
		return 1 + word.length() + IntStream.range(0, word.length() - 1)
				.map(i -> (word.charAt(i + 1) - word.charAt(i) + 26) % 26).sum() <= word.length() * 11;
	}
}
