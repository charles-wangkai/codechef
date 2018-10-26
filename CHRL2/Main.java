import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final String TARGET = "CHEF";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		System.out.println(solve(S));

		sc.close();
	}

	static int solve(String S) {
		Map<Character, Queue<Integer>> letterToIndices = new HashMap<>();
		for (char letter : TARGET.toCharArray()) {
			letterToIndices.put(letter, new LinkedList<>());
		}

		for (int i = 0; i < S.length(); i++) {
			letterToIndices.get(S.charAt(i)).offer(i);
		}

		int result = 0;
		while (find(letterToIndices)) {
			result++;
		}
		return result;
	}

	static boolean find(Map<Character, Queue<Integer>> letterToIndices) {
		int beginIndex = -1;
		for (char letter : TARGET.toCharArray()) {
			Queue<Integer> indices = letterToIndices.get(letter);
			while (!indices.isEmpty() && indices.peek() < beginIndex) {
				indices.poll();
			}

			if (indices.isEmpty()) {
				return false;
			}

			beginIndex = indices.poll() + 1;
		}
		return true;
	}
}
