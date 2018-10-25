import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			String[] words = readArray(sc, N);
			String[][] phrases = new String[K][];
			for (int i = 0; i < phrases.length; i++) {
				int L = sc.nextInt();
				phrases[i] = readArray(sc, L);
			}

			boolean[] solution = solve(words, phrases);
			System.out.println(String.join(" ", IntStream.range(0, solution.length)
					.mapToObj(i -> solution[i] ? "YES" : "NO").collect(Collectors.toList())));
		}

		sc.close();
	}

	static String[] readArray(Scanner sc, int size) {
		String[] result = new String[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.next();
		}
		return result;
	}

	static boolean[] solve(String[] words, String[][] phrases) {
		Set<String> phraseWords = Arrays.stream(phrases).flatMap(Arrays::stream).collect(Collectors.toSet());

		boolean[] result = new boolean[words.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = phraseWords.contains(words[i]);
		}
		return result;
	}
}
