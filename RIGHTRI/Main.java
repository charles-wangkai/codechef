import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			Point p1 = readPoint(sc);
			Point p2 = readPoint(sc);
			Point p3 = readPoint(sc);

			if (solve(p1, p2, p3)) {
				result++;
			}
		}
		System.out.println(result);

		sc.close();
	}

	static Point readPoint(Scanner sc) {
		int x = sc.nextInt();
		int y = sc.nextInt();

		return new Point(x, y);
	}

	static boolean solve(Point p1, Point p2, Point p3) {
		int[] distanceSquares = { computeDistanceSquare(p1, p2), computeDistanceSquare(p2, p3),
				computeDistanceSquare(p3, p1) };
		Arrays.sort(distanceSquares);

		return distanceSquares[0] + distanceSquares[1] == distanceSquares[2];
	}

	static int computeDistanceSquare(Point a, Point b) {
		return (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
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