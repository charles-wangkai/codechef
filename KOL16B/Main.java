import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[] modifiedA = new int[n];
			for (int i = 0; i < modifiedA.length; i++) {
				modifiedA[i] = sc.nextInt();
			}

			System.out.println(String.format("Case %d:", tc + 1));
			System.out.println(solve(modifiedA));
		}

		sc.close();
	}

	static String solve(int[] modifiedA) {
		int n = modifiedA.length;

		int[] A = new int[n];
		int[] B = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = modifiedA[i] % (1 << 16);
			B[i] = modifiedA[i] / (1 << 16);
		}

		return String.format("%s\n%s", formatArray(A), formatArray(B));
	}

	static String formatArray(int[] a) {
		return String.join(" ", Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.toList()));
	}
}
