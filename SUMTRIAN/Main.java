import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int tc = 0; tc < n; tc++) {
			int size = sc.nextInt();
			int[][] triangle = new int[size][];
			for (int r = 0; r < size; r++) {
				triangle[r] = new int[r + 1];
				for (int c = 0; c < triangle[r].length; c++) {
					triangle[r][c] = sc.nextInt();
				}
			}

			System.out.println(solve(triangle));
		}

		sc.close();
	}

	static int solve(int[][] triangle) {
		int size = triangle.length;

		int[] sums = { triangle[0][0] };
		for (int r = 1; r < size; r++) {
			int[] nextSums = new int[r + 1];
			for (int c = 0; c < nextSums.length; c++) {
				nextSums[c] = Math.max((c == 0) ? -1 : sums[c - 1], (c == nextSums.length - 1) ? -1 : sums[c])
						+ triangle[r][c];
			}

			sums = nextSums;
		}

		return Arrays.stream(sums).max().getAsInt();
	}
}
