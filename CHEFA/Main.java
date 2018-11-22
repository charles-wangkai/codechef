import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static long solve(int[] A) {
		int[] sortedA = Arrays.stream(A).boxed().sorted(Collections.reverseOrder()).mapToInt(x -> x).toArray();
		return IntStream.range(0, A.length).filter(i -> i % 2 == 0).mapToLong(i -> sortedA[i]).sum();
	}
}
