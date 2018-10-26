import java.util.Scanner;

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
		long result = 0;
		int beginIndex = 0;
		while (beginIndex != A.length) {
			int endIndex = beginIndex;
			while (endIndex + 1 < A.length && A[endIndex + 1] >= A[endIndex]) {
				endIndex++;
			}

			int length = endIndex - beginIndex + 1;
			result += (long) length * (length + 1) / 2;

			beginIndex = endIndex + 1;
		}
		return result;
	}
}
