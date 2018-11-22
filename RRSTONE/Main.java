import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(
				String.join(" ", Arrays.stream(solve(A, K)).mapToObj(String::valueOf).collect(Collectors.toList())));

		sc.close();
	}

	static long[] solve(int[] A, int K) {
		long[] result = Arrays.stream(A).asLongStream().toArray();

		if (K % 2 == 0) {
			if (K != 0) {
				turn(result);
				turn(result);
			}
		} else {
			turn(result);
		}

		return result;
	}

	static void turn(long[] a) {
		long max = Arrays.stream(a).max().getAsLong();
		for (int i = 0; i < a.length; i++) {
			a[i] = max - a[i];
		}
	}
}
