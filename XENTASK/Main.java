import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] X = readArray(sc, N);
			int[] Y = readArray(sc, N);

			System.out.println(solve(X, Y));
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

	static int solve(int[] X, int[] Y) {
		int[][] times = { X, Y };

		return Math.min(computeTotalTime(times, 0), computeTotalTime(times, 1));
	}

	static int computeTotalTime(int[][] times, int startIndex) {
		return IntStream.range(0, times[0].length).map(i -> times[(i + startIndex) % 2][i]).sum();
	}
}
