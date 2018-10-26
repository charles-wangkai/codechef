import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[] L = readArray(sc, n);
			int[] R = readArray(sc, n);

			System.out.println(solve(L, R));
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

	static int solve(int[] L, int[] R) {
		int resultIndex = 0;
		for (int i = 1; i < L.length; i++) {
			if (L[i] * R[i] > L[resultIndex] * R[resultIndex]
					|| (L[i] * R[i] == L[resultIndex] * R[resultIndex] && R[i] > R[resultIndex])) {
				resultIndex = i;
			}
		}
		return resultIndex + 1;
	}
}
