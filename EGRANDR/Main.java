import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] scores = new int[N];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}

			System.out.println(solve(scores) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(int[] scores) {
		return Arrays.stream(scores).allMatch(score -> score > 2) && Arrays.stream(scores).anyMatch(score -> score == 5)
				&& Arrays.stream(scores).sum() >= 4 * scores.length;
	}
}
