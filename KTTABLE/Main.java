import java.util.Scanner;
import java.util.stream.IntStream;

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

	static int solve(int[] A, int[] B) {
		return (int) IntStream.range(0, A.length).filter(i -> B[i] <= (A[i] - (i == 0 ? 0 : A[i - 1]))).count();
	}
}
