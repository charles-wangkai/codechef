import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[] C = new int[M + 1];
			for (int i = 1; i < C.length; i++) {
				C[i] = Integer.parseInt(st.nextToken());
			}
			int[] D = new int[N];
			int[] F = new int[N];
			int[] B = new int[N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				D[i] = Integer.parseInt(st.nextToken());
				F[i] = Integer.parseInt(st.nextToken());
				B[i] = Integer.parseInt(st.nextToken());
			}

			System.out.println(solve(D, F, B, C));
		}
	}

	static String solve(int[] D, int[] F, int[] B, int[] C) {
		int M = C.length - 1;

		int[] counts = new int[M + 1];
		for (int Di : D) {
			counts[Di]++;
		}

		int[] matchedCounts = new int[M + 1];
		int[] nonMatchedCounts = new int[M + 1];
		for (int i = 1; i <= M; i++) {
			matchedCounts[i] = Math.min(C[i], counts[i]);
			nonMatchedCounts[i] = Math.max(0, C[i] - counts[i]);
		}

		int nonMatchedIndex = 1;
		long profit = 0;
		List<Integer> flavours = new ArrayList<>();
		for (int i = 0; i < D.length; i++) {
			if (matchedCounts[D[i]] != 0) {
				profit += F[i];
				matchedCounts[D[i]]--;

				flavours.add(D[i]);
			} else {
				profit += B[i];

				while (nonMatchedCounts[nonMatchedIndex] == 0) {
					nonMatchedIndex++;
				}
				nonMatchedCounts[nonMatchedIndex]--;

				flavours.add(nonMatchedIndex);
			}
		}

		return String.format("%d\n%s", profit, flavours.stream().map(String::valueOf).collect(Collectors.joining(" ")));
	}
}
