import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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

	static String solve(int[] A) {
		int[] result = new int[A.length];
		for (int i = result.length - 2; i >= 0; i--) {
			result[i] = (A[i] == A[i + 1]) ? result[i + 1] : (A.length - i - 1);
		}

		return Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" "));
	}
}
