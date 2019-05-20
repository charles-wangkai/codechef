import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final int[] R_OFFSETS = { -1, 0, 1, 0 };
	static final int[] C_OFFSETS = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			int[][] a = new int[R][C];
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					a[r][c] = sc.nextInt();
				}
			}

			System.out.println(solve(a) ? "Stable" : "Unstable");
		}

		sc.close();
	}

	static boolean solve(int[][] a) {
		int R = a.length;
		int C = a[0].length;

		return IntStream.range(0, R)
				.allMatch(r -> IntStream.range(0, C).allMatch(c -> computeAdjacentNum(R, C, r, c) > a[r][c]));
	}

	static int computeAdjacentNum(int R, int C, int r, int c) {
		return (int) IntStream.range(0, R_OFFSETS.length).filter(i -> {
			int adjR = r + R_OFFSETS[i];
			int adjC = c + C_OFFSETS[i];

			return adjR >= 0 && adjR < R && adjC >= 0 && adjC < C;
		}).count();
	}
}
