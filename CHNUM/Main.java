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

	static String solve(int[] A) {
		int negCnt = 0;
		int posCnt = 0;
		int zeroCnt = 0;
		for (int score : A) {
			if (score < 0) {
				negCnt++;
			} else if (score > 0) {
				posCnt++;
			} else {
				zeroCnt++;
			}
		}

		int minGroupSize;
		if (zeroCnt > 0) {
			minGroupSize = 1;
		} else {
			minGroupSize = Math.min((negCnt == 0) ? Integer.MAX_VALUE : negCnt,
					(posCnt == 0) ? Integer.MAX_VALUE : posCnt);
		}

		int maxGroupSize = Math.max(negCnt, posCnt) + zeroCnt;

		return String.format("%d %d", maxGroupSize, minGroupSize);
	}
}
