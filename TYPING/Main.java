import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static final Map<Character, Hand> CHAR_TO_HAND = new HashMap<>();
	static {
		CHAR_TO_HAND.put('d', Hand.LEFT);
		CHAR_TO_HAND.put('f', Hand.LEFT);
		CHAR_TO_HAND.put('j', Hand.RIGHT);
		CHAR_TO_HAND.put('k', Hand.RIGHT);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String[] words = new String[N];
			for (int i = 0; i < words.length; i++) {
				words[i] = sc.next();
			}

			System.out.println(solve(words));
		}

		sc.close();
	}

	static int solve(String[] words) {
		Set<String> history = new HashSet<>();
		int result = 0;
		for (String word : words) {
			int time = computeTime(word);

			if (history.contains(word)) {
				result += time / 2;
			} else {
				result += time;
			}

			history.add(word);
		}
		return result;
	}

	static int computeTime(String word) {
		int time = 0;
		for (int i = 0; i < word.length(); i++) {
			if (i > 0 && CHAR_TO_HAND.get(word.charAt(i)) == CHAR_TO_HAND.get(word.charAt(i - 1))) {
				time += 4;
			} else {
				time += 2;
			}
		}
		return time;
	}
}

enum Hand {
	LEFT, RIGHT
}