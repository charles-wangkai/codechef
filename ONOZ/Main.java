import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int H = sc.nextInt();
			int M = sc.nextInt();

			System.out.println(solve(H, M));
		}

		sc.close();
	}

	static int solve(int H, int M) {
		return 1 + IntStream.rangeClosed(1, 9).map(digit -> computeValidNum(H, digit) * computeValidNum(M, digit))
				.sum();
	}

	static int computeValidNum(int limit, int digit) {
		int result = 0;
		int number = digit;
		while (number < limit) {
			result++;

			number = number * 10 + digit;
		}

		return result;
	}
}
