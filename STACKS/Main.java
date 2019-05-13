import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static String solve(int[] A) {
		List<Integer> tops = new ArrayList<>();
		for (int ai : A) {
			int index = findIndex(tops, ai);

			if (index >= 0) {
				tops.set(index, ai);
			} else {
				tops.add(ai);
			}
		}

		return String.format("%d %s", tops.size(), tops.stream().map(String::valueOf).collect(Collectors.joining(" ")));
	}

	static int findIndex(List<Integer> tops, int target) {
		int lower = 0;
		int upper = tops.size() - 1;
		int result = -1;
		while (lower <= upper) {
			int middle = (lower + upper) / 2;

			if (target < tops.get(middle)) {
				result = middle;
				upper = middle - 1;
			} else {
				lower = middle + 1;
			}
		}
		return result;
	}
}
