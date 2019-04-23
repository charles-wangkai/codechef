import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String[] S = new String[N];
			for (int i = 0; i < S.length; i++) {
				S[i] = sc.next();
			}

			System.out.println(solve(S));
		}

		sc.close();
	}

	static int solve(String[] S) {
		Map<Character, Integer> letterToCount = buildLetterToCount(Arrays.stream(S).collect(Collectors.joining()));

		return buildLetterToCount("codechef").entrySet().stream()
				.mapToInt(entry -> letterToCount.getOrDefault(entry.getKey(), 0) / entry.getValue()).min().getAsInt();
	}

	static Map<Character, Integer> buildLetterToCount(String str) {
		Map<Character, Integer> letterToCount = new HashMap<>();
		for (char letter : str.toCharArray()) {
			letterToCount.put(letter, letterToCount.getOrDefault(letter, 0) + 1);
		}
		return letterToCount;
	}
}
