import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int n = sc.nextInt();
			Point[] points = new Point[n];
			for (int i = 0; i < points.length; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				points[i] = new Point(x, y);
			}

			System.out.printf("%.2f\n", solve(points));
		}

		sc.close();
	}

	static double solve(Point[] points) {
		Arrays.sort(points, (p1, p2) -> (p1.x != p2.x) ? Integer.compare(p1.x, p2.x) : Integer.compare(p2.y, p1.y));

		return IntStream.range(0, points.length - 1)
				.mapToDouble(i -> Math.sqrt((points[i].x - points[i + 1].x) * (points[i].x - points[i + 1].x)
						+ (points[i].y - points[i + 1].y) * (points[i].y - points[i + 1].y)))
				.sum();
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