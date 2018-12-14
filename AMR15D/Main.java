import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] A = readArray(sc);
		int[] K = readArray(sc);
		Arrays.stream(solve(A, K)).forEach(System.out::println);

		sc.close();
	}

	static int[] readArray(Scanner sc) {
		int size = sc.nextInt();
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static int[] solve(int[] A, int[] K) {
		Arrays.sort(A);

		int[] prefixSums = buildPrefixSums(A);

		int[] result = new int[K.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = prefixSums[divideToCeil(prefixSums.length, K[i] + 1) - 1];
		}
		return result;
	}

	static int[] buildPrefixSums(int[] A) {
		int prefixSum = 0;
		int[] prefixSums = new int[A.length];
		for (int i = 0; i < prefixSums.length; i++) {
			prefixSum += A[i];
			prefixSums[i] = prefixSum;
		}
		return prefixSums;
	}

	static int divideToCeil(int x, int y) {
		return x / y + (x % y == 0 ? 0 : 1);
	}
}
