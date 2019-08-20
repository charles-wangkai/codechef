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
			int[] a = new int[N];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(solve(a));
		}

		sc.close();
	}

	static String solve(int[] a) {
		Map<Integer, Integer> deltaToCount = new HashMap<>();
		for (int i = 0; i < a.length - 1; i++) {
			int delta = a[i + 1] - a[i];

			deltaToCount.put(delta, deltaToCount.getOrDefault(delta, 0) + 1);
		}

		int maxCount = deltaToCount.values().stream().mapToInt(x -> x).max().getAsInt();
		if (maxCount == 1) {
			if (a[2] - a[0] == 2 * (a[3] - a[2])) {
				a[1] = (a[0] + a[2]) / 2;
			} else {
				a[2] = (a[1] + a[3]) / 2;
			}
		} else {
			int deltaWithMaxCount = deltaToCount.keySet().stream().filter(delta -> deltaToCount.get(delta) == maxCount)
					.findAny().get();
			if (a[1] - a[0] == deltaWithMaxCount) {
				for (int i = 1; i < a.length; i++) {
					a[i] = a[i - 1] + deltaWithMaxCount;
				}
			} else {
				for (int i = a.length - 2; i >= 0; i--) {
					a[i] = a[i + 1] - deltaWithMaxCount;
				}
			}
		}

		return Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" "));
	}
}
