import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S) ? "DPS" : "!DPS");
		}

		sc.close();
	}

	static boolean solve(String S) {
		Map<Character, Integer> letterToCount = new HashMap<>();
		for (char letter : S.toCharArray()) {
			letterToCount.put(letter, letterToCount.getOrDefault(letter, 0) + 1);
		}

		int oddCountNum = (int) letterToCount.values().stream().filter(count -> count % 2 != 0).count();

		return oddCountNum >= 1 && oddCountNum <= 3;
	}
}
