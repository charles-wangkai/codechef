import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int E = sc.nextInt();
			int M = sc.nextInt();

			int[][] otherScores = new int[N - 1][E];
			for (int i = 0; i < N - 1; i++) {
				for (int j = 0; j < E; j++) {
					otherScores[i][j] = sc.nextInt();
				}
			}

			int[] sergeyScores = new int[E - 1];
			for (int i = 0; i < sergeyScores.length; i++) {
				sergeyScores[i] = sc.nextInt();
			}

			System.out.println(solve(K, M, otherScores, sergeyScores));
		}

		sc.close();
	}

	static String solve(int K, int M, int[][] otherScores, int[] sergeyScores) {
		int N = otherScores.length + 1;

		SortedMap<Long, Integer> totalScoreToCount = new TreeMap<>();
		for (int[] otherScore : otherScores) {
			long totalScore = Arrays.stream(otherScore).asLongStream().sum();
			totalScoreToCount.put(totalScore, totalScoreToCount.getOrDefault(totalScore, 0) + 1);
		}

		int peopleNum = 0;
		for (long totalScore : totalScoreToCount.keySet()) {
			peopleNum += totalScoreToCount.get(totalScore);

			if (peopleNum >= N - K) {
				long lastScore = Math.max(0, totalScore + 1 - Arrays.stream(sergeyScores).asLongStream().sum());
				if (lastScore <= M) {
					return String.valueOf(lastScore);
				} else {
					return "Impossible";
				}
			}
		}

		return null;
	}
}
