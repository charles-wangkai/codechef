import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] prices = new int[N];
			for (int i = 0; i < prices.length; i++) {
				prices[i] = sc.nextInt();
			}

			System.out.println(solve(prices));
		}

		sc.close();
	}

	static int solve(int[] prices) {
		List<Integer> sortedPrices = Arrays.stream(prices).boxed().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		return IntStream.range(0, sortedPrices.size()).filter(i -> i % 4 <= 1).map(i -> sortedPrices.get(i)).sum();
	}
}
