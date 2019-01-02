import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			int[][] solution = solve(N);
			for (int[] row : solution) {
				System.out
						.println(String.join(" ", Arrays.stream(row).mapToObj(String::valueOf).toArray(String[]::new)));
			}
		}

		sc.close();
	}

	static int[][] solve(int N) {
		int[][] pattern = new int[N][N];
		int number = 1;
		for (int i = 0; i < N * 2 - 1; i++) {
			for (int r = 0, c = i; c >= 0; r++, c--) {
				if (r < N && c < N) {
					pattern[r][c] = number;
					number++;
				}
			}
		}
		return pattern;
	}
}
