import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String X = sc.next();
			String Y = sc.next();

			System.out.println(solve(X, Y) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(String X, String Y) {
		return IntStream.range(0, X.length())
				.allMatch(i -> X.charAt(i) == '?' || Y.charAt(i) == '?' || X.charAt(i) == Y.charAt(i));
	}
}
