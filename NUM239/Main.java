import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int L = sc.nextInt();
			int R = sc.nextInt();

			System.out.println(solve(L, R));
		}

		sc.close();
	}

	static int solve(int L, int R) {
		return (int) IntStream.rangeClosed(L, R)
				.filter(x -> IntStream.of(2, 3, 9).anyMatch(remainder -> x % 10 == remainder)).count();
	}
}
