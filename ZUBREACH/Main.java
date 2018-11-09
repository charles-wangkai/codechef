import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int Rx = sc.nextInt();
			int Ry = sc.nextInt();
			sc.nextInt();
			String moves = sc.next();

			System.out.println("Case " + (tc + 1) + ": " + solve(M, N, Rx, Ry, moves));
		}

		sc.close();
	}

	static String solve(int M, int N, int Rx, int Ry, String moves) {
		int x = 0;
		int y = 0;
		for (char move : moves.toCharArray()) {
			if (move == 'U') {
				y++;
			} else if (move == 'D') {
				y--;
			} else if (move == 'R') {
				x++;
			} else if (move == 'L') {
				x--;
			}
		}

		if (x == Rx && y == Ry) {
			return "REACHED";
		} else if (x < 0 || x > M || y < 0 || y > N) {
			return "DANGER";
		} else {
			return "SOMEWHERE";
		}
	}
}
