import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Triangle[] triangles = new Triangle[N];
		for (int i = 0; i < triangles.length; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();

			triangles[i] = new Triangle(x1, y1, x2, y2, x3, y3);
		}
		System.out.println(solve(triangles));

		sc.close();
	}

	static String solve(Triangle[] triangles) {
		int minDoubleArea = Integer.MAX_VALUE;
		int minAreaIndex = -1;
		int maxDoubleArea = Integer.MIN_VALUE;
		int maxAreaIndex = -1;
		for (int i = 0; i < triangles.length; i++) {
			int doubleArea = triangles[i].computeDoubleArea();

			if (doubleArea <= minDoubleArea) {
				minDoubleArea = doubleArea;
				minAreaIndex = i;
			}

			if (doubleArea >= maxDoubleArea) {
				maxDoubleArea = doubleArea;
				maxAreaIndex = i;
			}
		}
		return String.format("%d %d", minAreaIndex + 1, maxAreaIndex + 1);
	}
}

class Triangle {
	int x1;
	int y1;
	int x2;
	int y2;
	int x3;
	int y3;

	Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	int computeDoubleArea() {
		return Math.abs((x1 * y2 - x2 * y1) + (x2 * y3 - x3 * y2) + (x3 * y1 - x1 * y3));
	}
}