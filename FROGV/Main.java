import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int P = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		Pair[] pairs = new Pair[P];
		for (int i = 0; i < pairs.length; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			pairs[i] = new Pair(a, b);
		}
		System.out.println(solve(A, K, pairs));

		sc.close();
	}

	static String solve(int[] A, int K, Pair[] pairs) {
		Point[] points = IntStream.range(0, A.length).mapToObj(i -> new Point(i + 1, A[i]))
				.sorted((p1, p2) -> Integer.compare(p1.x, p2.x)).toArray(Point[]::new);

		Map<Integer, Integer> indexToGroup = new HashMap<>();
		int group = 0;
		for (int i = 0; i < points.length; i++) {
			if (i != 0 && points[i].x - points[i - 1].x > K) {
				group++;
			}

			indexToGroup.put(points[i].index, group);
		}

		return String.join("\n",
				Arrays.stream(pairs)
						.map(pair -> indexToGroup.get(pair.a).equals(indexToGroup.get(pair.b)) ? "Yes" : "No")
						.collect(Collectors.toList()));
	}
}

class Point {
	int index;
	int x;

	Point(int index, int x) {
		this.index = index;
		this.x = x;
	}
}

class Pair {
	int a;
	int b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}