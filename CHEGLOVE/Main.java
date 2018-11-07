import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] L = readArray(sc, N);
			int[] G = readArray(sc, N);

			System.out.println(solve(L, G));
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

	static String solve(int[] L, int[] G) {
		int N = L.length;
		int[] reversedG = IntStream.range(0, N).map(i -> G[N - 1 - i]).toArray();

		if (canWear(L, G)) {
			if (canWear(L, reversedG)) {
				return "both";
			} else {
				return "front";
			}
		} else {
			if (canWear(L, reversedG)) {
				return "back";
			} else {
				return "none";
			}
		}
	}

	static boolean canWear(int[] L, int[] glove) {
		return IntStream.range(0, L.length).allMatch(i -> L[i] <= glove[i]);
	}
}
