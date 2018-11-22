import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int tc = 0; tc < N; tc++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			System.out.println(solve(i, j));
		}

		sc.close();
	}

	static int solve(int i, int j) {
		List<Integer> pathI = computePath(i);
		List<Integer> pathJ = computePath(j);

		int index = 0;
		while (index < pathI.size() && index < pathJ.size() && pathI.get(index).equals(pathJ.get(index))) {
			index++;
		}

		return (pathI.size() - index) + (pathJ.size() - index);
	}

	static List<Integer> computePath(int node) {
		List<Integer> path = new ArrayList<>();
		while (true) {
			path.add(0, node);

			if (node == 1) {
				break;
			}

			node /= 2;
		}
		return path;
	}
}
