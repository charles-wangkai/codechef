import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(N, K));
		}

		sc.close();
	}

	static String solve(int N, int K) {
		return IntStream.concat(IntStream.rangeClosed(N - K, N), IntStream.rangeClosed(1, N - K - 1))
				.mapToObj(String::valueOf).collect(Collectors.joining(" "));
	}
}
