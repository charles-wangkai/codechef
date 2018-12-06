import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			Pair[] pairs = new Pair[m];
			for (int i = 0; i < pairs.length; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();

				pairs[i] = new Pair(u, v);
			}

			System.out.println(String.join(" ", solve(n, pairs).stream().map(String::valueOf).toArray(String[]::new)));
		}

		sc.close();
	}

	static List<Integer> solve(int n, Pair[] pairs) {
		LinkedList<Integer> result = new LinkedList<>();
		boolean[] used = new boolean[n];

		for (int i = pairs.length - 1; i >= 0; i--) {
			if (!used[pairs[i].u] && !used[pairs[i].v]) {
				used[pairs[i].u] = true;
				used[pairs[i].v] = true;

				result.addFirst(i);
			}
		}
		return result;
	}
}

class Pair {
	int u;
	int v;

	Pair(int u, int v) {
		this.u = u;
		this.v = v;
	}
}