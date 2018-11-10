import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String s = sc.next();

			System.out.println(solve(s) ? "Dynamic" : "Not");
		}

		sc.close();
	}

	static boolean solve(String s) {
		Map<Character, Integer> chToCount = new HashMap<>();
		for (char ch : s.toCharArray()) {
			chToCount.put(ch, chToCount.getOrDefault(ch, 0) + 1);
		}

		List<Integer> counts = chToCount.values().stream().sorted().collect(Collectors.toList());

		if (counts.size() <= 2) {
			return true;
		}

		if (check(counts)) {
			return true;
		}

		int temp = counts.get(0);
		counts.set(0, counts.get(1));
		counts.set(1, temp);

		return check(counts);
	}

	static boolean check(List<Integer> counts) {
		return IntStream.range(2, counts.size()).allMatch(i -> counts.get(i) == counts.get(i - 2) + counts.get(i - 1));
	}
}
