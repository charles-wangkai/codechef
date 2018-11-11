import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			Point[] knights = new Point[N];
			for (int i = 0; i < knights.length; i++) {
				knights[i] = readPoint(sc);
			}
			Point king = readPoint(sc);

			System.out.println(solve(knights, king) ? "YES" : "NO");
		}

		sc.close();
	}

	static Point readPoint(Scanner sc) {
		int x = sc.nextInt();
		int y = sc.nextInt();

		return new Point(x, y);
	}

	static boolean solve(Point[] knights, Point king) {
		return IntStream.rangeClosed(-1, 1).allMatch(offsetX -> IntStream.rangeClosed(-1, 1)
				.allMatch(offsetY -> isCheck(knights, king.x + offsetX, king.y + offsetY)));
	}

	static boolean isCheck(Point[] knights, int x, int y) {
		return Arrays.stream(knights).anyMatch(knight -> Math.abs((knight.x - x) * (knight.y - y)) == 2);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}