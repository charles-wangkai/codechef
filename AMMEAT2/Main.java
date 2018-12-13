import java.util.Arrays;
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

			int[] solution = solve(N, K);
			if (solution == null) {
				System.out.println(-1);
			} else {
				System.out.println(String.join(" ",
						Arrays.stream(solution).mapToObj(String::valueOf).collect(Collectors.toList())));
			}
		}

		sc.close();
	}

	static int[] solve(int N, int K) {
		if (K == 1) {
			return new int[] { 1 };
		}

		if (K > N / 2) {
			return null;
		}

		return IntStream.rangeClosed(1, K).map(x -> x * 2).toArray();
	}
}
