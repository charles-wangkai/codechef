import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] strings = new String[N];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = sc.next();
		}
		System.out.println(solve(strings));

		sc.close();
	}

	static String solve(String[] strings) {
		Map<Character, Integer> mergedLetterToCount = null;
		for (String string : strings) {
			mergedLetterToCount = merge(mergedLetterToCount, buildLetterToCount(string));
		}

		if (mergedLetterToCount.isEmpty()) {
			return "no such string";
		}

		StringBuilder result = new StringBuilder();
		for (char letter : mergedLetterToCount.keySet().stream().sorted().collect(Collectors.toList())) {
			for (int i = 0; i < mergedLetterToCount.get(letter); i++) {
				result.append(letter);
			}
		}
		return result.toString();
	}

	static Map<Character, Integer> buildLetterToCount(String string) {
		Map<Character, Integer> letterToCount = new HashMap<>();
		for (char letter : string.toCharArray()) {
			letterToCount.put(letter, letterToCount.getOrDefault(letter, 0) + 1);
		}
		return letterToCount;
	}

	static Map<Character, Integer> merge(Map<Character, Integer> letterToCount1,
			Map<Character, Integer> letterToCount2) {
		if (letterToCount1 == null) {
			return letterToCount2;
		}

		Map<Character, Integer> result = new HashMap<>();
		for (char letter : letterToCount1.keySet()) {
			if (letterToCount2.containsKey(letter)) {
				result.put(letter, Math.min(letterToCount1.get(letter), letterToCount2.get(letter)));
			}
		}
		return result;
	}
}
