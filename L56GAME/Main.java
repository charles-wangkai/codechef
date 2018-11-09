import java.util.Arrays;
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

	static int solve(int[] A) {
		int oddNum = (int) Arrays.stream(A).filter(x -> x % 2 != 0).count();
		int evenNum = A.length - oddNum;

		evenNum += oddNum / 2;
		oddNum %= 2;

		evenNum = (evenNum == 0) ? 0 : 1;

		return evenNum + oddNum;
	}
}
