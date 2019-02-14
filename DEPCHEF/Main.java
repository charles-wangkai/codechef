import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] a = readArray(sc, N);
			int[] d = readArray(sc, N);

			System.out.println(solve(a, d));
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

	static int solve(int[] a, int[] d) {
		return IntStream.range(0, a.length).filter(i -> d[i] > a[(i - 1 + a.length) % a.length] + a[(i + 1) % a.length])
				.map(i -> d[i]).max().orElse(-1);
	}
}
