import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] D = new int[N];
			int[] V = new int[N];
			for (int i = 0; i < N; i++) {
				D[i] = sc.nextInt();
				V[i] = sc.nextInt();
			}

			System.out.println(solve(D, V, M));
		}

		sc.close();
	}

	static int solve(int[] D, int[] V, int M) {
		Map<Integer, Integer> dayToMaxTastiness = new HashMap<>();
		for (int i = 0; i < D.length; i++) {
			dayToMaxTastiness.put(D[i], Math.max(dayToMaxTastiness.getOrDefault(D[i], 0), V[i]));
		}

		return dayToMaxTastiness.values().stream().sorted(Collections.reverseOrder()).limit(2).mapToInt(x -> x).sum();
	}
}
