import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();
		for (int tc = 0; tc < TC; tc++) {
			int N = sc.nextInt();
			int W = sc.nextInt();
			int[] C = new int[N];
			int[] P = new int[N];
			int[] T = new int[N];
			for (int i = 0; i < N; i++) {
				C[i] = sc.nextInt();
				P[i] = sc.nextInt();
				T[i] = sc.nextInt();
			}

			System.out.println(solve(C, P, T, W));
		}

		sc.close();
	}

	static int solve(int[] C, int[] P, int[] T, int W) {
		int N = C.length;

		Map<Integer, Integer> timeToTotalPoint = new HashMap<>();
		timeToTotalPoint.put(0, 0);
		for (int i = 0; i < N; i++) {
			Map<Integer, Integer> nextTimeToTotalPoint = new HashMap<>(timeToTotalPoint);

			for (int time : timeToTotalPoint.keySet()) {
				int nextTime = time + T[i];

				if (nextTime <= W) {
					nextTimeToTotalPoint.put(nextTime, Math.max(nextTimeToTotalPoint.getOrDefault(nextTime, 0),
							timeToTotalPoint.get(time) + C[i] * P[i]));
				}
			}

			timeToTotalPoint = nextTimeToTotalPoint;
		}

		return timeToTotalPoint.values().stream().mapToInt(x -> x).max().getAsInt();
	}
}
