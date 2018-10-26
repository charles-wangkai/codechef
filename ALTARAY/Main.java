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

			System.out.println(
					String.join(" ", Arrays.stream(solve(A)).mapToObj(String::valueOf).collect(Collectors.toList())));
		}

		sc.close();
	}

	static int[] solve(int[] A) {
		int[] result = new int[A.length];
		int beginIndex = 0;
		while (beginIndex != A.length) {
			int endIndex = beginIndex;
			while (endIndex + 1 < A.length && Math.signum(A[endIndex + 1]) != Math.signum(A[endIndex])) {
				endIndex++;
			}

			for (int i = beginIndex; i <= endIndex; i++) {
				result[i] = endIndex - i + 1;
			}

			beginIndex = endIndex + 1;
		}
		return result;
	}
}
