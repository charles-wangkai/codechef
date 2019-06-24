import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			String S = sc.next();

			System.out.println(solve(S));
		}

		sc.close();
	}

	static int solve(String S) {
		int presentCount = (int) S.chars().filter(ch -> ch == 'P').count();
		int markableCount = (int) IntStream.rangeClosed(2, S.length() - 3)
				.filter(i -> S.charAt(i) == 'A' && (S.charAt(i - 2) == 'P' || S.charAt(i - 1) == 'P')
						&& (S.charAt(i + 2) == 'P' || S.charAt(i + 1) == 'P'))
				.count();

		int targetCount = divideToCeil(S.length() * 3, 4);
		if (presentCount + markableCount < targetCount) {
			return -1;
		} else {
			return Math.max(0, targetCount - presentCount);
		}
	}

	static int divideToCeil(int x, int y) {
		return x / y + (x % y == 0 ? 0 : 1);
	}
}
