import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}

			int[] u = new int[N - 1];
			int[] v = new int[N - 1];
			for (int i = 0; i < N - 1; i++) {
				st = new StringTokenizer(br.readLine());
				u[i] = Integer.parseInt(st.nextToken());
				v[i] = Integer.parseInt(st.nextToken());
			}

			System.out.println(solve(A, X, u, v));
		}
	}

	static long solve(int[] A, int X, int[] u, int[] v) {
		int N = A.length;

		@SuppressWarnings("unchecked")
		List<Integer>[] adjLists = new List[N];
		for (int i = 0; i < adjLists.length; i++) {
			adjLists[i] = new ArrayList<>();
		}

		for (int i = 0; i < u.length; i++) {
			adjLists[u[i] - 1].add(v[i] - 1);
			adjLists[v[i] - 1].add(u[i] - 1);
		}

		return search(A, X, adjLists, new boolean[N], 0);
	}

	static long search(int[] A, int X, List<Integer>[] adjLists, boolean[] visited, int node) {
		visited[node] = true;

		long sum = A[node];

		for (int adj : adjLists[node]) {
			if (!visited[adj]) {
				sum += search(A, X, adjLists, visited, adj);
			}
		}

		return Math.max(-X, sum);
	}
}
