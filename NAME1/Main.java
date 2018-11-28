import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String A = sc.next();
			String B = sc.next();
			int N = sc.nextInt();
			String[] C = new String[N];
			for (int i = 0; i < C.length; i++) {
				C[i] = sc.next();
			}

			System.out.println(solve(A, B, C) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String A, String B, String[] C) {
		Map<Character, Integer> parentLetterToCount = combine(buildLetterToCount(A), buildLetterToCount(B));
		Map<Character, Integer> childrenLetterToCount = Arrays.stream(C).map(Main::buildLetterToCount)
				.reduce(Main::combine).get();

		return childrenLetterToCount.keySet().stream().allMatch(childrenLetter -> childrenLetterToCount
				.get(childrenLetter) <= parentLetterToCount.getOrDefault(childrenLetter, 0));
	}

	static Map<Character, Integer> buildLetterToCount(String s) {
		Map<Character, Integer> letterToCount = new HashMap<>();
		for (char letter : s.toCharArray()) {
			letterToCount.put(letter, letterToCount.getOrDefault(letter, 0) + 1);
		}
		return letterToCount;
	}

	static Map<Character, Integer> combine(Map<Character, Integer> letterToCount1,
			Map<Character, Integer> letterToCount2) {
		return Stream.concat(letterToCount1.keySet().stream(), letterToCount2.keySet().stream()).distinct()
				.collect(Collectors.toMap(Function.identity(),
						letter -> letterToCount1.getOrDefault(letter, 0) + letterToCount2.getOrDefault(letter, 0)));
	}
}
