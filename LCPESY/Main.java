import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String A = sc.next();
			String B = sc.next();

			System.out.println(solve(A, B));
		}

		sc.close();
	}

	static int solve(String A, String B) {
		Map<Character, Integer> chToCountA = computeChToCount(A);
		Map<Character, Integer> chToCountB = computeChToCount(B);

		return chToCountA.keySet().stream()
				.mapToInt(chA -> Math.min(chToCountA.get(chA), chToCountB.getOrDefault(chA, 0))).sum();
	}

	static Map<Character, Integer> computeChToCount(String s) {
		Map<Character, Integer> chToCount = new HashMap<>();
		for (char ch : s.toCharArray()) {
			chToCount.put(ch, chToCount.getOrDefault(ch, 0) + 1);
		}
		return chToCount;
	}
}
