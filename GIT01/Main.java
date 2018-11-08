import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			char[][] colors = new char[N][M];
			for (int r = 0; r < N; r++) {
				String line = sc.next();
				for (int c = 0; c < M; c++) {
					colors[r][c] = line.charAt(c);
				}
			}

			System.out.println(solve(colors));
		}

		sc.close();
	}

	static int solve(char[][] colors) {
		return Math.min(computeCost(colors, 'R'), computeCost(colors, 'G'));
	}

	static int computeCost(char[][] colors, char evenCellTarget) {
		int N = colors.length;
		int M = colors[0].length;

		int cost = 0;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (((r + c) % 2 == 0 && colors[r][c] != evenCellTarget)
						|| ((r + c) % 2 != 0 && colors[r][c] == evenCellTarget)) {
					if (colors[r][c] == 'R') {
						cost += 5;
					} else {
						cost += 3;
					}
				}
			}
		}
		return cost;
	}
}
