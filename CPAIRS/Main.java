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
		int evenNum = 0;
		for (int ai : A) {
			if (ai % 2 == 0) {
				evenNum++;
			} else {
				result += evenNum;
			}
		}
		return result;
	}
}
