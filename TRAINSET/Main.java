import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String[] w = new String[N];
			int[] s = new int[N];
			for (int i = 0; i < N; i++) {
				w[i] = sc.next();
				s[i] = sc.nextInt();
			}

			System.out.println(solve(w, s));
		}

		sc.close();
	}

	static int solve(String[] w, int[] s) {
		Map<String, int[]> wordToCounts = new HashMap<>();
		for (int i = 0; i < w.length; i++) {
			if (!wordToCounts.containsKey(w[i])) {
				wordToCounts.put(w[i], new int[2]);
			}

			wordToCounts.get(w[i])[s[i]]++;
		}

		return wordToCounts.values().stream().mapToInt(counts -> Math.max(counts[0], counts[1])).sum();
	}
}
