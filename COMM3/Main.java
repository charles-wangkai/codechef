import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int R = sc.nextInt();
			Point p1 = readPoint(sc);
			Point p2 = readPoint(sc);
			Point p3 = readPoint(sc);

			System.out.println(solve(R, p1, p2, p3) ? "yes" : "no");
		}

		sc.close();
	}

	static Point readPoint(Scanner sc) {
		int x = sc.nextInt();
		int y = sc.nextInt();

		return new Point(x, y);
	}

	static boolean solve(int R, Point p1, Point p2, Point p3) {
		if (isClose(R, p1, p2)) {
			return isClose(R, p1, p3) || isClose(R, p2, p3);
		} else {
			return isClose(R, p1, p3) && isClose(R, p2, p3);
		}
	}

	static boolean isClose(int R, Point pa, Point pb) {
		return square(pa.x - pb.x) + square(pa.y - pb.y) <= square(R);
	}

	static int square(int x) {
		return x * x;
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