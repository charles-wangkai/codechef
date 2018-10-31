import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int[] prices = new int[26];
			for (int i = 0; i < prices.length; i++) {
				prices[i] = sc.nextInt();
			}
			String text = sc.next();

			System.out.println(solve(prices, text));
		}

		sc.close();
	}

	static int solve(int[] prices, String text) {
		Set<Integer> letters = text.chars().map(ch -> ch - 'a').boxed().collect(Collectors.toSet());
		return IntStream.range(0, prices.length).filter(i -> !letters.contains(i)).map(i -> prices[i]).sum();
	}
}
