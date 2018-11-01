import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] A = readArray(sc, N);
			int[] B = readArray(sc, N);

			System.out.println(solve(A, B));
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

	static String solve(int[] A, int[] B) {
		int totalTimeA = computeTotalTime(A);
		int totalTimeB = computeTotalTime(B);

		if (totalTimeA < totalTimeB) {
			return "Alice";
		} else if (totalTimeA > totalTimeB) {
			return "Bob";
		} else {
			return "Draw";
		}
	}

	static int computeTotalTime(int[] times) {
		return Arrays.stream(times).sum() - Arrays.stream(times).max().getAsInt();
	}
}
