import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int S = sc.nextInt();
			int[] x = readArray(sc, X);
			int[] y = readArray(sc, Y);

			System.out.println(solve(N, M, x, y, S));
		}

		sc.close();
	}

	static int[] readArray(Scanner sc, int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}

		return result;
	}

	static int solve(int N, int M, int[] x, int[] y, int S) {
		return computeNumForSide(N, x, S) * computeNumForSide(M, y, S);
	}

	static int computeNumForSide(int size, int[] rivers, int S) {
		int[] borders = IntStream
				.concat(IntStream.concat(IntStream.of(0), Arrays.stream(rivers)), IntStream.of(size + 1)).toArray();

		return IntStream.range(0, borders.length - 1).map(i -> (borders[i + 1] - borders[i] - 1) / S).sum();
	}
}
