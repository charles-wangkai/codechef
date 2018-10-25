import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			System.out.println(solve(x1, y1, x2, y2));
		}

		sc.close();
	}

	static String solve(int x1, int y1, int x2, int y2) {
		if (x1 == x2) {
			if (y1 < y2) {
				return "up";
			} else {
				return "down";
			}
		} else if (y1 == y2) {
			if (x1 < x2) {
				return "right";
			} else {
				return "left";
			}
		} else {
			return "sad";
		}
	}
}
