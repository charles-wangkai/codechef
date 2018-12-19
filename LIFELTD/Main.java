import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final int SIZE = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			char[][] cells = new char[SIZE][SIZE];
			for (int r = 0; r < SIZE; r++) {
				String line = sc.next();
				for (int c = 0; c < SIZE; c++) {
					cells[r][c] = line.charAt(c);
				}
			}

			System.out.println(solve(cells) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(char[][] cells) {
		return IntStream.range(0, SIZE - 1)
				.anyMatch(r -> IntStream.range(0, SIZE - 1).anyMatch(c -> isPattern(cells, r, c)));
	}

	static boolean isPattern(char[][] cells, int r, int c) {
		return cells[r][c] == 'l' && cells[r + 1][c] == 'l' && cells[r + 1][c + 1] == 'l';
	}
}
