import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] matrix = new int[R][C];
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				matrix[r][c] = sc.nextInt();
			}
		}
		System.out.println(solve(matrix));

		sc.close();
	}

	static String solve(int[][] matrix) {
		int R = matrix.length;
		int C = matrix[0].length;

		int[] rowMins = new int[R];
		Arrays.fill(rowMins, Integer.MAX_VALUE);
		int[] colMaxs = new int[C];
		Arrays.fill(colMaxs, Integer.MIN_VALUE);

		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				rowMins[r] = Math.min(rowMins[r], matrix[r][c]);
				colMaxs[c] = Math.max(colMaxs[c], matrix[r][c]);
			}
		}

		Set<Integer> rowMinSet = new HashSet<>();
		for (int rowMin : rowMins) {
			rowMinSet.add(rowMin);
		}

		Set<Integer> colMaxSet = new HashSet<>();
		for (int colMax : colMaxs) {
			colMaxSet.add(colMax);
		}

		for (int rowMin : rowMinSet) {
			if (colMaxSet.contains(rowMin)) {
				return String.valueOf(rowMin);
			}
		}
		return "GUESS";
	}
}
