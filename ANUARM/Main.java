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
			int M = sc.nextInt();
			int[] rounds = new int[M];
			for (int i = 0; i < rounds.length; i++) {
				rounds[i] = sc.nextInt();
			}

			System.out.println(String.join(" ",
					Arrays.stream(solve(N, rounds)).mapToObj(String::valueOf).collect(Collectors.toList())));
		}

		sc.close();
	}

	static int[] solve(int N, int[] rounds) {
		int min = Arrays.stream(rounds).min().getAsInt();
		int max = Arrays.stream(rounds).max().getAsInt();

		return IntStream.range(0, N).map(i -> Math.max(Math.abs(min - i), Math.abs(max - i))).toArray();
	}
}
