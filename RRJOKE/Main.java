import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			Point[] points = new Point[N];
			for (int i = 0; i < points.length; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				points[i] = new Point(x, y);
			}

			System.out.println(solve(points));
		}

		sc.close();
	}

	static int solve(Point[] points) {
		return IntStream.rangeClosed(1, points.length).reduce(0, (x, y) -> x ^ y);
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