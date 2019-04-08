import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] A = readArray(sc, N);
		int[] B = readArray(sc, N);
		for (int i = 0; i < Q; i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();

			System.out.println(solve(A, B, L, R));
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

	static long solve(int[] A, int[] B, int L, int R) {
		return IntStream.rangeClosed(L - 1, R - 1).mapToLong(i -> (long) A[i] * B[i]).sum();
	}
}
