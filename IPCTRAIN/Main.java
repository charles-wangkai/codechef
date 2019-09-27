import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			int[] days = new int[N];
			int[] teaches = new int[N];
			int[] sads = new int[N];
			for (int i = 0; i < N; i++) {
				days[i] = sc.nextInt();
				teaches[i] = sc.nextInt();
				sads[i] = sc.nextInt();
			}

			System.out.println(solve(days, teaches, sads, D));
		}

		sc.close();
	}

	static long solve(int[] days, int[] teaches, int[] sads, int D) {
		@SuppressWarnings("unchecked")
		List<Integer>[] indexLists = new List[D + 1];
		for (int i = 1; i < indexLists.length; i++) {
			indexLists[i] = new ArrayList<>();
		}
		for (int i = 0; i < days.length; i++) {
			indexLists[days[i]].add(i);
		}

		SortedMap<Integer, Long> sadToCount = new TreeMap<>();
		for (int i = 1; i <= D; i++) {
			for (int index : indexLists[i]) {
				updateMap(sadToCount, sads[index], teaches[index]);
			}

			if (!sadToCount.isEmpty()) {
				updateMap(sadToCount, sadToCount.lastKey(), -1);
			}
		}

		return sadToCount.entrySet().stream().mapToLong(entry -> entry.getKey() * entry.getValue()).sum();
	}

	static void updateMap(SortedMap<Integer, Long> sadToCount, int sad, int countDelta) {
		sadToCount.put(sad, sadToCount.getOrDefault(sad, 0L) + countDelta);
		sadToCount.remove(sad, 0L);
	}
}
