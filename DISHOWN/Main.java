import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] S = new int[N + 1];
			for (int i = 1; i < S.length; i++) {
				S[i] = sc.nextInt();
			}
			int Q = sc.nextInt();
			Query[] queries = new Query[Q];
			for (int i = 0; i < queries.length; i++) {
				int type = sc.nextInt();
				int x = sc.nextInt();
				int y;
				if (type == 0) {
					y = sc.nextInt();
				} else {
					y = -1;
				}

				queries[i] = new Query(type, x, y);
			}

			System.out.print(solve(S, queries));
		}

		sc.close();
	}

	static String solve(int[] S, Query[] queries) {
		int[] parents = new int[S.length];
		Arrays.fill(parents, -1);

		StringBuilder result = new StringBuilder();
		for (Query query : queries) {
			if (query.type == 0) {
				int rootX = findRoot(parents, query.x);
				int rootY = findRoot(parents, query.y);

				if (rootX == rootY) {
					result.append("Invalid query!").append("\n");
				} else {
					if (S[rootX] < S[rootY]) {
						parents[rootX] = rootY;
					} else if (S[rootX] > S[rootY]) {
						parents[rootY] = rootX;
					}
				}
			} else if (query.type == 1) {
				int root = findRoot(parents, query.x);

				result.append(root).append("\n");
			}
		}
		return result.toString();
	}

	static int findRoot(int[] parents, int node) {
		int root = node;
		while (parents[root] != -1) {
			root = parents[root];
		}

		int p = node;
		while (p != root) {
			int next = parents[p];
			parents[p] = root;
			p = next;
		}

		return root;
	}
}

class Query {
	int type;
	int x;
	int y;

	Query(int type, int x, int y) {
		this.type = type;
		this.x = x;
		this.y = y;
	}
}