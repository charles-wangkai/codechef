import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			char[][] grid = new char[N][N];
			for (int r = 0; r < N; r++) {
				String line = sc.next();
				for (int c = 0; c < N; c++) {
					grid[r][c] = line.charAt(c);
				}
			}

			System.out.println(solve(grid));
		}

		sc.close();
	}

	static int solve(char[][] grid) {
		int N = grid.length;

		boolean[][] toEasts = new boolean[N][N];
		for (int r = 0; r < N; r++) {
			for (int c = N - 1; c >= 0; c--) {
				if (grid[r][c] == '#') {
					break;
				}

				toEasts[r][c] = true;
			}
		}

		boolean[][] toSouths = new boolean[N][N];
		for (int c = 0; c < N; c++) {
			for (int r = N - 1; r >= 0; r--) {
				if (grid[r][c] == '#') {
					break;
				}

				toSouths[r][c] = true;
			}
		}

		return IntStream.range(0, N)
				.map(r -> (int) IntStream.range(0, N).filter(c -> toEasts[r][c] && toSouths[r][c]).count()).sum();
	}
}
