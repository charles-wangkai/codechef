import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String S) {
		if (S.length() % 2 != 0) {
			return false;
		}

		Map<Character, Integer> chToCount = new HashMap<>();
		for (char ch : S.toCharArray()) {
			chToCount.put(ch, chToCount.getOrDefault(ch, 0) + 1);
		}

		return chToCount.values().stream().anyMatch(count -> count == S.length() / 2);
	}
}
