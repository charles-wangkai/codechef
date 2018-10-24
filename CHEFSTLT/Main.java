import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S1 = sc.next();
			String S2 = sc.next();

			System.out.println(solve(S1, S2));
		}

		sc.close();
	}

	static String solve(String S1, String S2) {
		int minDiff = (int) IntStream.range(0, S1.length())
				.filter(i -> S1.charAt(i) != '?' && S2.charAt(i) != '?' && S1.charAt(i) != S2.charAt(i)).count();
		int maxDiff = minDiff
				+ (int) IntStream.range(0, S1.length()).filter(i -> S1.charAt(i) == '?' || S2.charAt(i) == '?').count();

		return String.format("%d %d", minDiff, maxDiff);
	}
}
