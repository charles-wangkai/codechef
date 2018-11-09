import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final int COIN_LIMIT = 100000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] c = readArray(sc, N);
		int[] t = readArray(sc, N);
		System.out.println(solve(c, t));

		sc.close();
	}

	static int[] readArray(Scanner sc, int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static int solve(int[] c, int[] t) {
		return Math.min(findMinCoin(c, t, 1) + findMinCoin(c, t, 2), findMinCoin(c, t, 3));
	}

	static int findMinCoin(int[] c, int[] t, int targetType) {
		OptionalInt minCoin = IntStream.range(0, c.length).filter(i -> t[i] == targetType).map(i -> c[i]).min();
		return minCoin.isPresent() ? minCoin.getAsInt() : COIN_LIMIT;
	}
}
