import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static final int[] OFFSETS = { -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		System.out.println(solve(S));

		sc.close();
	}

	static int solve(String S) {
		Map<Character, List<Integer>> digitToIndices = new HashMap<>();
		for (int i = 0; i < S.length(); i++) {
			char digit = S.charAt(i);
			if (!digitToIndices.containsKey(digit)) {
				digitToIndices.put(digit, new ArrayList<>());
			}
			digitToIndices.get(digit).add(i);
		}

		Set<Character> sameDigitJumps = new HashSet<>();
		boolean[] visited = new boolean[S.length()];
		visited[0] = true;
		Queue<Element> queue = new LinkedList<>();
		queue.offer(new Element(0, 0));
		while (true) {
			Element head = queue.poll();
			char digit = S.charAt(head.index);

			if (head.index == S.length() - 1) {
				return head.jump;
			}

			for (int offset : OFFSETS) {
				int nextIndex = head.index + offset;
				if (nextIndex >= 0 && nextIndex < S.length() && !visited[nextIndex]) {
					visited[nextIndex] = true;
					queue.offer(new Element(nextIndex, head.jump + 1));
				}
			}

			if (!sameDigitJumps.contains(digit)) {
				sameDigitJumps.add(digit);

				for (int nextIndex : digitToIndices.get(digit)) {
					if (!visited[nextIndex]) {
						visited[nextIndex] = true;
						queue.offer(new Element(nextIndex, head.jump + 1));
					}
				}
			}
		}
	}
}

class Element {
	int index;
	int jump;

	Element(int index, int jump) {
		this.index = index;
		this.jump = jump;
	}
}